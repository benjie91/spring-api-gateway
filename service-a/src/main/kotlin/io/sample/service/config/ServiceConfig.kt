package io.sample.service.config


import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.servers.Server
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.List


@Configuration
class ServiceConfig() {

//    @Bean
//    fun customOpenAPI(): OpenAPI {
//        val server = Server().apply {
//            this.url = "http://localhost:1111/sample-service"
//        }
//        return OpenAPI().servers(mutableListOf(server))
//    }
}
