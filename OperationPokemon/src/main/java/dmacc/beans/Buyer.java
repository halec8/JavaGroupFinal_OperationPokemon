package dmacc.beans;

/**
 * @author Cody Hale - chale
 * CIS175 - Fall 2021
 * Nov 15, 2021
 */
public class Buyer {
	
	private long id;
	private String name;
	private String relationship;

	public Buyer() {
		super();
		
		}
		public Buyer(String name) {
		super();
		this.name = name;
		
		}
		public Buyer(String name, String relationship) {
		super();
		this.name = name;
		this.relationship = relationship;
		}
		public Buyer(int id, String name, String relationship) {

			this.id = id;
			this.name = name;
			this.relationship = relationship;
		}
		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(long id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the relationship
		 */
		public String getRelationship() {
			return relationship;
		}
		/**
		 * @param relationship the relationship to set
		 */
		public void setRelationship(String relationship) {
			this.relationship = relationship;
		}
		
		@Override
		public String toString() {
			return "Buyer [id: " + id + ", name: " + name + ", relationship: " + relationship + "]";
			}
}
