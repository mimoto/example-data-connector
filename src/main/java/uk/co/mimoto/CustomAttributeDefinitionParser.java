package uk.co.mimoto;

import javax.annotation.Nonnull;
import net.shibboleth.idp.attribute.resolver.spring.ad.BaseAttributeDefinitionParser;
import org.w3c.dom.Element;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

public class CustomAttributeDefinitionParser extends BaseAttributeDefinitionParser {
  
  protected Class<CustomDataConnector> getBeanClass(Element element) {
      return CustomDataConnector.class;
  }

	protected void doParse(@Nonnull Element config, @Nonnull ParserContext parserContext, @Nonnull BeanDefinitionBuilder builder) {
		super.doParse(config,parserContext,builder);
	}
}
