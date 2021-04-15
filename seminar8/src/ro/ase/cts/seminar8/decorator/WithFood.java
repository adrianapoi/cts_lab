package ro.ase.cts.seminar8.decorator;

public class WithFood extends AbstractBackpackDecorator {
	String food;

	public WithFood(AbstractBackpack basicBackpack) {
		super(basicBackpack);
	}

	public WithFood(AbstractBackpack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + " + getFood());
	}

	public String getFood() {
		return this.food;
	}

}
