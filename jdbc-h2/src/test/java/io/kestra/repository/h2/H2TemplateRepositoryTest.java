package io.kestra.repository.h2;

import io.kestra.jdbc.repository.AbstractJdbcTemplateRepositoryTest;
import io.micronaut.context.annotation.Property;
import io.micronaut.core.util.StringUtils;

@Property(name = "kestra.templates.enabled", value = StringUtils.TRUE)
public class H2TemplateRepositoryTest extends AbstractJdbcTemplateRepositoryTest {

}
