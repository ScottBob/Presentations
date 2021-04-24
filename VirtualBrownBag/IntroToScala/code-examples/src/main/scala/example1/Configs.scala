package example1

import com.typesafe.config.{Config, ConfigFactory}
import pureconfig.ConfigSource
import pureconfig.generic.auto._

case class ApplicationConfig(port: Int, host: String)

case class Configs(application: ApplicationConfig)

object Configs {
  def apply(config: Config): Configs = ConfigSource.fromConfig(config).at("configs").loadOrThrow[Configs]
  def apply(): Configs = apply(ConfigFactory.load)
}
