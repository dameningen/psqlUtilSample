package com.example.demo.application.config;

import java.io.IOException;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

/**
 * 対応しないURLの場合、固定ページを返す。
 */
@Configuration
public class Html5HistoryModeResourceConfig implements WebMvcConfigurer {

    private final Resources resourceProperties = new Resources();

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 全パスをこのリソースハンドラーの処理対象にする
        registry.addResourceHandler("/**")
                // 静的リソース配置先のパスを指定する
                .addResourceLocations(resourceProperties.getStaticLocations())
                // 開発時はfalse、本番はtrueが望ましい。trueにしておくとメモリ上にキャッシュされるためI/Oが軽減される
                .resourceChain(resourceProperties.getChain().isCache())
                // 拡張したPathResourceResolverを読み込ませる
                .addResolver(new SpaPageResourceResolver());
    }

    public static class SpaPageResourceResolver extends PathResourceResolver {
        @Override
        protected Resource getResource(String resourcePath, Resource location) throws IOException {
            // まずはPathResourceResolverで静的リソースを取得する
            Resource resource = super.getResource(resourcePath, location);
            // 取得できなかった場合は、index.htmlを返す
            return resource != null ? resource : super.getResource("index.html", location);
        }
    }
}