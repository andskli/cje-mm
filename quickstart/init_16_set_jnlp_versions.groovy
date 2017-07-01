import java.util.logging.Logger
import jenkins.model.*

Logger logger = Logger.getLogger("init.d init_16_set_jnlp_versions.groovy")

Set enabledProtocols = [
    "Ping",
    "JNLP4-connect"
]
logger.info("Setting accepted JNLP protocols to: " + enabledProtocols)

Jenkins.instance.setAgentProtocols(enabledProtocols)