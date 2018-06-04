package com.renault.faq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.renault.faq.util.LuceneUtil;
@RunWith(SpringJUnit4ClassRunner.class)
public class LuceneTest {

	@Autowired
	private LuceneUtil lucene;
	
	@Test
	private void testSearch() {
		lucene.search("java");
		
	}
}
