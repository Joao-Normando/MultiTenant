package com.joao.normando.Multi.Tenant;

import com.joao.normando.Multi.Tenant.master.MasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@ComponentScan(basePackages = "com.joao.normando.Multi.Tenant")
@EnableJpaRepositories(basePackages = "com.joao.normando.Multi.Tenant")

public class MultiTenantApplication  {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MultiTenantApplication.class, args);
    }

    @Bean
    public DataSource dataSource() {
        CustomRoutingDataSource customDataSource = new CustomRoutingDataSource();
        customDataSource.setTargetDataSources(MasterService.getDataSourceHashMap());
        return customDataSource;
    }
}