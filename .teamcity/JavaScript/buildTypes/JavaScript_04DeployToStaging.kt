package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object JavaScript_04DeployToStaging : BuildType({
    uuid = "2c6879a5-a013-4077-ab0e-372593a9f60b"
    id = "JavaScript_04DeployToStaging"
    name = "04. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComOzonsozonsTeamcityCourseCards)

    }



    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
