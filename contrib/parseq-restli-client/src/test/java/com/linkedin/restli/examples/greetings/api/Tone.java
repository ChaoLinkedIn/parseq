
package com.linkedin.restli.examples.greetings.api;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/jodzga/dev/pegasus_trunk/pegasus/restli-int-test-api/src/main/pegasus/com/linkedin/restli/examples/greetings/api/Tone.pdsc.", date = "Thu Mar 31 14:04:52 PDT 2016")
public enum Tone {

    FRIENDLY,
    SINCERE,
    INSULTING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"enum\",\"name\":\"Tone\",\"namespace\":\"com.linkedin.restli.examples.greetings.api\",\"symbols\":[\"FRIENDLY\",\"SINCERE\",\"INSULTING\"]}"));

}
