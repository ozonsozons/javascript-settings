package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_03InternetExplorer : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template1)
    uuid = "javascripttest_03_InternetExplorerTest"
    id = "JavaScript_03InternetExplorer"
    name = "03. InternetExplorer"

    params {
        param("Browser", "IE")
    }

    dependencies {
        dependency(JavaScript.buildTypes.JavaScript_01FastTests) {
            snapshot {
            }
        }
    }
})
