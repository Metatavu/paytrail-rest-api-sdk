#!/bin/bash

if [ "$TRAVIS_PULL_REQUEST" != "false" ] && [ -n "${GITHUB_TOKEN}" ] && [ -n "${SONAR_TOKEN}" ]; then
  echo "Pull request"
  
  PROJECT_VERSION=`cat pom.xml|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'`
  
  sh sonar-scanner/bin/sonar-scanner -Dsonar.host.url=$SONAR_HOST_URL \
    -Dsonar.analysis.mode=issues \
    -Dsonar.login=$SONAR_TOKEN \
    -Dsonar.projectKey=$SONAR_PROJECT_KEY \
    -Dsonar.projectName=mecm-reader \
    -Dsonar.projectVersion=$PROJECT_VERSION \
    -Dsonar.sources=src \
    -Dsonar.java.source=1.8 \
    -Dsonar.github.oauth=$GITHUB_TOKEN \
    -Dsonar.github.repository=$TRAVIS_REPO_SLUG \
    -Dsonar.github.pullRequest=$TRAVIS_PULL_REQUEST
  set -e
  mvn clean test -DrepoToken=$COVERALLS_TOKEN -DskipCoverage=false
  set +e
elif [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ $TRAVIS_BRANCH == "develop" ]; then

  echo "Develop build"
  
  PROJECT_VERSION=`cat pom.xml|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'`
  
  sh sonar-scanner/bin/sonar-scanner -Dsonar.host.url=$SONAR_HOST_URL \
    -Dsonar.analysis.mode=publish \
    -Dsonar.login=$SONAR_TOKEN \
    -Dsonar.projectKey=$SONAR_PROJECT_KEY \
    -Dsonar.projectName=mecm-reader \
    -Dsonar.projectVersion=$PROJECT_VERSION \
    -Dsonar.sources=src \
    -Dsonar.java.source=1.8

elif [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ $TRAVIS_BRANCH == "master" ]; then
  echo "Master build"
else
  echo "Push to branch" 	  
fi