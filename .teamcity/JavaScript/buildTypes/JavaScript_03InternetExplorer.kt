package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03InternetExplorer : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template1)
    uuid = "d0f9a8a9-8613-4025-9c40-28c432ecd4be"
    id = "JavaScript_03InternetExplorer"
    name = "03. InternetExplorer"

    params {
        param("Browser", "Internet Explorer")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
