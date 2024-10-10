package br.com.eraldolima.kafka_consumer01.record;

import java.math.BigDecimal;

public record OrderRecord (Long id, String name, String description, BigDecimal amount) {

}
