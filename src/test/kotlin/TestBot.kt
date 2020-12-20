import com.kotlindiscord.kord.extensions.ExtensibleBot
import com.kotlindiscord.kordex.ext.mappings.MappingsExtension

val bot = ExtensibleBot(
    token = System.getenv("TOKEN"),
    prefix = "!",
    addSentryExtension = false
)

suspend fun main() {
    bot.addExtension(MappingsExtension::class)

    bot.start()
}
