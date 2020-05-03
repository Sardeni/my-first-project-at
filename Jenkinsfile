import sun.util.resources.cldr.nyn.CalendarData_nyn_UG

pipeline {
    agent any
    tools {
        maven 'maven'
        allure 'allure'
    }
    stages {
        stage('clone repository') {
            steps {
                deleteDir()
                git branch: 'master', credentialsId: 'gitlab_new', url: 'https://github.com/Sardeni/my-first-project-at.git'
            }
        }

        stage('Clean') {
            steps {
                sh "mvn clean"
            }
        }

        stage('run tests') {
            steps {
                sh "mvn test -Dselenide.browser=chrome -Dselenide.remote=http://192.168.0.11:4444/wd/hub"
            }
        }
        stage('generate allure report') {
                steps {
                    allure([
                            includeProperties: true,
                            properties       : [],
                            reportBuildPolicy: 'ALWAYS',
                            results          : [[path: 'target/allure-results']]
                    ])
                }
            }
    }

}
