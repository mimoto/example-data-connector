package uk.co.mimoto;

import net.shibboleth.idp.attribute.resolver.spring.dc.AbstractDataConnectorParser;
import org.w3c.dom.Element;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import javax.annotation.Nonnull;

public class CustomDataConnectorParser extends AbstractDataConnectorParser {

  protected Class<CustomDataConnector> getNativeBeanClass() {
      return CustomDataConnector.class;
  }

  protected void doV2Parse(@Nonnull Element pluginConfig, @Nonnull ParserContext parserContext, @Nonnull BeanDefinitionBuilder builder) {
	}
}
