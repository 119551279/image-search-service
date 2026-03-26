// Configuration class for Milvus settings.

package com.example.imagesearch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.scalar.db.config.ConfigurationLoader;
import com.scalar.db.schema.TableSchema;
import com.scalar.db.service.MilvusService;

@Configuration
public class MilvusConfig {

    @Bean
    public MilvusService milvusService() {
        ConfigurationLoader configurationLoader = new ConfigurationLoader();
        return new MilvusService(configurationLoader.load());
    }

    @Bean
    public TableSchema tableSchema() {
        return TableSchema.newBuilder()
                .addColumn("image_id", Types.VARCHAR)
                .addColumn("features", Types.FLOAT)
                .build();
    }
}