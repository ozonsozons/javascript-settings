package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03Firefox : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template1)
    uuid = "d0f9a8a9-8613-4025-9c40-28c432ecd4be"
    id = "JavaScript_03Firefox"
    name = "03. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
