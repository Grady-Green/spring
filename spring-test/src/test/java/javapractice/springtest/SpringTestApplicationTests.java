package javapractice.springtest;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class SpringTestApplicationTests {
	MockMvc mvc;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Autowired
	WebApplicationContext webApplicationConnect;

	@Before
	public void setUp() throws JsonProcessingException {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
	}

	@Test
	public void get() throws Exception {
		String expectedResult = "hello world!";
		String uri = "/test/getString";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).param("str","SpringTest").accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
		Assert.assertTrue("正确，正确的返回值为200", status == 200);
		Assert.assertFalse("错误，正确的返回值为200", status != 200);
//		Assert.assertTrue("数据一致", expectedResult.equals(content));
//		Assert.assertFalse("数据不一致", !expectedResult.equals(content));
	}

	@Test
	public void post()throws Exception{
		String uri = "/test/getString";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).param("str","SpringTest").accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		String content = mvcResult.getResponse().getContentAsString();
	}
}
