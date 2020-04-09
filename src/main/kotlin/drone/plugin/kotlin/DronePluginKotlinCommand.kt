package drone.plugin.kotlin

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters

@Command(name = "drone-plugin-kotlin", description = ["..."],
        mixinStandardHelpOptions = true)
class DronePluginKotlinCommand : Runnable {

    override fun run() {
        val example = System.getenv("PLUGIN_EXAMPLE")

        println("\uD83D\uDE80\uD83D\uDE80\uD83D\uDE80 $example")
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            PicocliRunner.run(DronePluginKotlinCommand::class.java, *args)
        }
    }
}
