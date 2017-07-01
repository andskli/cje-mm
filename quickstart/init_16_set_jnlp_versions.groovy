import java.util.logging.Logger
import jenkins.model.*

def configName = "init_16_set_jnlp_versions.groovy"
Logger logger = Logger.getLogger("$configName")

Set enabledProtocols = [
    "Ping",
    "JNLP4-connect"
]

File disableSaveScript = new File(Jenkins.getInstance().getRootDir(), ".disable-$configName")
if (disableSaveScript.exists()) {
    logger.info("DISABLED $configName")
    return
}

logger.info("Setting accepted JNLP protocols to: " + enabledProtocols)
Jenkins.instance.setAgentProtocols(enabledProtocols)

disableSaveScript.createNewFile()