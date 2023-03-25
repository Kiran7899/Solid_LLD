Few bird can't fly.

If all birds can fly and eat vice versa.Both functions can be in same interface?

No. It will violate Interface Segregation Principle.

Interface Segregation is SRP for Interfaces.

To overcome:

interface1 implements I1,I2{}

class crow implements interface1