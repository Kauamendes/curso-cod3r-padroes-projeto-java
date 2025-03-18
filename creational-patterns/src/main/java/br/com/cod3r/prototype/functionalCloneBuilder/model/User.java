package br.com.cod3r.prototype.functionalCloneBuilder.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class User {
	private final String name;
	private final Integer age;
	private final Address address;


    protected User clone() throws CloneNotSupportedException {
        Address addressClone = address.clone();
		return new User(name, age, addressClone);
    }

	public Builder cloneBuilder() {
		return new Builder(name, age, address);
	}

	public static class Builder {

		private String name;
		private Integer age;
		private Address address;

		private Builder(String name, Integer age, Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}

		public User now() {
			return new User(name, age, address);
		}
	}
}
