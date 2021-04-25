package controller.converters;



public class RoomToStringConverter  implements  Converter<Room,String>{
	@Override
	public String convert(Room room) {
		return String.valueOf(room.getStandard() + " " + room.getNumber());
	}

}
