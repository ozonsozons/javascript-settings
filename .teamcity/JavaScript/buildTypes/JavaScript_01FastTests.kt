package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*

object JavaScript_01FastTests : BuildType({
    template(JavaScript.buildTypes.JavaScript_Template1)
    uuid = "41a7560b-4ada-40cf-89ac-f2dc55dd6adc"
    id = "JavaScript_01FastTests"
    name = "01.Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
