package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_Template1 : Template({
    uuid = "a789ca57-84ad-4f76-a84c-1ef6570dcb32"
    id = "JavaScript_Template1"
    name = "Template1"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComOzonsozonsTeamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_6"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_9"
            scriptContent = "npm test -- --dingle-run --browsers %Browser% --colors false --reporters teamcity"
        }
        stepsOrder = arrayListOf("RUNNER_6", "RUNNER_9")
    }


})
