package com.example.BookingSystem.Configuration;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

@Configuration
public class TranactionManagerConfig {

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){

        return new JpaTransactionManager(emf){
            @Override
            protected void doBegin(Object transaction, TransactionDefinition definition) {
                super.doBegin(transaction, definition);

                System.out.println("Txn logger-------> Transaction started with Progapation Type: "+definition.getPropagationBehavior()+"current state"+definition.getName());
            }

            @Override
            protected void doCommit(DefaultTransactionStatus status) {
                super.doCommit(status);

                System.out.println("Txn logger---->tranaction Committed with"+status.getTransactionName());
            }

            @Override
            protected void doRollback(DefaultTransactionStatus status) {
                super.doRollback(status);
                System.out.println("Txn logger---->tranaction rollback with"+status.getTransactionName());
            }
        };

    }
}
