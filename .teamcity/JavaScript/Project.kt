package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "9783ac07-42e2-4e88-bf88-34b7764ac7dc"
    id = "JavaScript"
    parentId = "_Root"
    name = "JavaScript"
    description = "My JS Project"

    vcsRoot(JavaScript_HttpsGithubComOzonsozonsTeamcityCourseCards)

    buildType(JavaScript_02Chrome)
    buildType(JavaScript_04DeployToStaging)
    buildType(JavaScript_01FastTests)
    buildType(JavaScript_03Firefox)
    buildType(JavaScript_03InternetExplorer)

    template(JavaScript_Template1)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "HttpsGithubComOzonsozonsJavascriptSettingsGit"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
