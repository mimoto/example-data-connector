package uk.co.mimoto;


import net.shibboleth.idp.attribute.resolver.AbstractDataConnector;
import net.shibboleth.idp.attribute.resolver.context.AttributeResolutionContext;
import net.shibboleth.idp.attribute.resolver.context.AttributeResolverWorkContext;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import net.shibboleth.idp.attribute.IdPAttribute;
import net.shibboleth.idp.attribute.IdPAttributeValue;
import net.shibboleth.idp.attribute.StringAttributeValue;
import net.shibboleth.idp.attribute.resolver.ResolutionException;
import java.util.ArrayList;
import java.util.List;

public class CustomDataConnector extends AbstractDataConnector {
  @Nonnull
  protected Map<String, IdPAttribute> doDataConnectorResolve(
            @Nonnull final AttributeResolutionContext resolutionContext,
            @Nonnull final AttributeResolverWorkContext workContext) throws ResolutionException {
    Map<String, IdPAttribute> result = new HashMap<String,IdPAttribute>();
    String username = resolutionContext.getPrincipal();
		String attributeName = "testAttribute";
    IdPAttribute attribute = new IdPAttribute(attributeName);
    List<IdPAttributeValue> values = new ArrayList<IdPAttributeValue>();
    values.add(new StringAttributeValue(username));
		attribute.setValues(values);
		result.put(attributeName,attribute);
		return result;
  }
}
