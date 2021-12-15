package io.gateway.server.config

import org.springdoc.core.SwaggerUiConfigParameters
import org.springframework.cloud.gateway.route.RouteDefinition
import org.springframework.cloud.gateway.route.RouteDefinitionLocator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig(
    private val routeDefinitionLocator: RouteDefinitionLocator,
    private val swaggerUiConfigParameters: SwaggerUiConfigParameters,
) {
    @Bean
    fun init() {
        val definitions = routeDefinitionLocator.routeDefinitions.collectList().block()
        swaggerUiConfigParameters.addGroup("test")

        definitions.stream().forEach { routeDefinition: RouteDefinition ->
            val name = routeDefinition.id
            if (name != "openapi") {
                println("Registering $name")
                swaggerUiConfigParameters.addGroup(name)
            }

        }
    }
}
