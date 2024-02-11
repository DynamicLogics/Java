package com.batch.configuration;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.batch.bean.Person;

public class PersonFieldSetMapper implements FieldSetMapper<Person> {

	@Override
	public Person mapFieldSet(FieldSet fieldSet) throws BindException {
		return new Person(
				fieldSet.readInt("id"),
				fieldSet.readString("name"),
				fieldSet.readString("surname")
		);
	}

}
