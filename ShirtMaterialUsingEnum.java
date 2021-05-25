package java22May;

enum ShirtMaterial {
	Cotton, Linen, Polyester;
}

public class ShirtMaterialUsingEnum {

	float collorSize;
	float length;
	ShirtMaterial material;

	public ShirtMaterialUsingEnum() {
		super();
	}

	public ShirtMaterialUsingEnum(float collorSize, float length, ShirtMaterial material) {
		super();
		this.collorSize = collorSize;
		this.length = length;
		this.material = material;
	}

	public float getCollorSize() {
		return collorSize;
	}

	public void setCollorSize(float collorSize) {
		this.collorSize = collorSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public ShirtMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ShirtMaterial material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "ShirtMaterialUsingEnum [collorSize=" + collorSize + ", length=" + length + ", material=" + material
				+ "]";
	}

	public static void main(String[] args) {
		ShirtMaterialUsingEnum obj = new ShirtMaterialUsingEnum(10, 10, ShirtMaterial.Cotton);
		System.out.println(obj);
		ShirtMaterialUsingEnum obj1 = new ShirtMaterialUsingEnum(10, 10, ShirtMaterial.Polyester);
		System.out.println(obj1);

	}

}