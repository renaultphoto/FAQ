package com.renault.faq.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.renault.faq.entity.Options;
import com.renault.faq.entity.custom.OptionsCustom;
import com.renault.faq.mapper.OptionsMapper;
import com.renault.faq.mapper.custom.OptionsMapperCustom;
import com.renault.faq.service.OptionsService;

/**
 * Created by 言曌 on 2017/9/7.
 */
public class OptionsServiceImpl implements OptionsService {

	@Autowired
	private OptionsMapperCustom optionsMapperCustom;

	@Autowired
	private OptionsMapper optionsMapper;

	@Override
	public OptionsCustom getOptions() throws Exception {
		Options options = optionsMapperCustom.getOptions();
		OptionsCustom optionsCustom = new OptionsCustom();
		if(options!=null) {
			BeanUtils.copyProperties(options, optionsCustom);
		}
		return optionsCustom;
	}

	@Override
	public void insertOptions(Options options) throws Exception {
		optionsMapper.insertSelective(options);
	}

	@Override
	public void updateOptions(Options options) throws Exception {
		optionsMapper.updateByPrimaryKeySelective(options);
	}
}
