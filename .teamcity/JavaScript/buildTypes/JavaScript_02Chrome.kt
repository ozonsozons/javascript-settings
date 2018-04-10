package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_02Chrome : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template1)
    uuid = "ad22e55c-843e-4d5d-af81-a0cf9947417a"
    id = "JavaScript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
