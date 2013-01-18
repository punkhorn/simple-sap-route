package tutorial.simple.route;


import org.apache.camel.test.junit4.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelContextXmlTest extends CamelSpringTestSupport {

	@Test
	public void testCamelRoute() throws Exception {
    	Thread.sleep(5000);
	}

	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext(
				"META-INF/spring/camelContext.xml");
	}

    @Override
    protected int getShutdownTimeout() {
    	return 0;
    }
}
