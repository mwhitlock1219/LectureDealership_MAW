## Object Relationships

### Association

- loose relationship, lifetimes of Object are independent of one another

- "is-a" relationship (doesnt apply to every instance of an Association)

#### Composition

* "has-a" relationship or a "part-of"
* A dealership "has a" Dept \* the depts don't exist outside of a dealership, therfore its a Composition relationship

#### Aggregation

- A dealership also "has" Vehicles, but its a less tightly couples relationship
  * Vehicles cpme and go throught the dealership and the dealership can manipulate the while it "owns" them
  * But, ultimately, a Vehicle _can_ exist outside of a dealership - this is called **aggregation**
