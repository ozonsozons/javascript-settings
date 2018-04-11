package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_04DeployToStaging : BuildType({
    uuid = "2c6879a5-a013-4077-ab0e-372593a9f60b"
    id = "JavaScript_04DeployToStaging"
    name = "04. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComOzonsozonsTeamcityCourseCards)

    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_02Chrome) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03Firefox) {
            snapshot {
            }
        }
        dependency(JavaScript.buildTypes.JavaScript_03InternetExplorer) {
            snapshot {
            }
        }
    }
})
