package br.com.cod3r.prototype.functionalCloneBuilder.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Address implements Cloneable {

	private final String street;
	private final Integer number;

    @Override
    public Address clone() throws CloneNotSupportedException {
		return  (Address) super.clone();
    }

	public static class Builder {

		private String street;
		private Integer number;

		private Builder(String street, Integer number) {
			this.street = street;
			this.number = number;
		}

		public Builder withStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder withNumber(Integer number) {
			this.number = number;
			return this;
		}

		public Address now() {
			return new Address(street, number);
		}
	}
}
