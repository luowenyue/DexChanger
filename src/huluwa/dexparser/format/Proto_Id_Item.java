package huluwa.dexparser.format;

import huluwa.dexparser.Exception.NonSameItemLengthException;
import huluwa.dexparser.Exception.QueryNextDataException;
import huluwa.dexparser.base.Item;

public class Proto_Id_Item extends Item {
	private static String itemName = "Proto_Id";
	private static int length = 12;

	public int shorty_id;
	public int return_type_id;
	public int params_off;

	public Proto_Id_Item(byte[] data, int off) throws NonSameItemLengthException, QueryNextDataException {
		super(data, off);
	}

	public int getLength() {
		return length;
	}

	public String getName() {
		return itemName;
	}

	@Override
	public void parseData() throws QueryNextDataException {
		shorty_id = cursor.nextInt();
		return_type_id = cursor.nextInt();
		params_off = cursor.nextInt();
	}

}
