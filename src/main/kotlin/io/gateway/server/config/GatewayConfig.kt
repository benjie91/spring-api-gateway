package io.gateway.server.config

import org.springframework.cloud.gateway.support.ipresolver.RemoteAddressResolver
import org.springframework.cloud.gateway.support.ipresolver.XForwardedRemoteAddressResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class GatewayConfig(
) {
//    @Bean
//    fun xForwardedRemoteAddressResolver(): RemoteAddressResolver? {
//        return XForwardedRemoteAddressResolver.maxTrustedIndex(1)
//    }
}
