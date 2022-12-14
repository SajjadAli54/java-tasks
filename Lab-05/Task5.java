class Aliens{

	private String name = null;
	private int health = 0;
	private int type = 0;
	
	public Aliens(String name,int health,int type){
		this.name = name;
		this.health = health;
		this.type = type;
	}

	int getType(){
		return type;
	}

}

class Snake extends Aliens{

	public static final int SNAKE_ALIEN = 0;
	Snake(String name,int health){
		super(name,health,SNAKE_ALIEN);
	}

	public static int getDamage(){
		return  10;
	}
}


class Ogre extends Aliens{

	public static final int OGRE_ALIEN = 1;

	Ogre(String name,int health){
		super(name,health,OGRE_ALIEN );
	}

	public static int getDamage(){
		return  6;
	}

}



class MarshawMan extends Aliens{
	
	public static final int MARSHAW_MAN_ALIEN = 2;
	
	MarshawMan(String name,int health){
		super(name,health,MARSHAW_MAN_ALIEN);
	}
		
	public static int getDamage(){
		return 1;
	}
	
}

class AlienPack{

	private Aliens aliens[];

	public AlienPack(int num){
		aliens = new Aliens[num];
	}

	public void addAlien(Aliens a, int i){
		if(i<aliens.length)
			aliens[i] = a;
	}

	public Aliens[] getAliens(){
		return aliens;
	}

	public int calculateDamage(){
		int damage = 0;
		for(Aliens x : aliens){
			if(x.getType() == Snake.SNAKE_ALIEN)
				damage +=Snake.getDamage();
			else if(x.getType() == Ogre.OGRE_ALIEN)
				damage += Ogre.getDamage();
			else if(x.getType() == MarshawMan.MARSHAW_MAN_ALIEN)
				damage += MarshawMan.getDamage();
		}

		return damage;
	}
}

class Task5{

	public static void main(String athd[]){

		Aliens a = new Aliens("Snake",25,0);
		Aliens b = new Aliens("Marshal",50,1);				
		Aliens c = new Aliens("Parzival",100,2);

		AlienPack alien = new AlienPack(3);
		alien.addAlien(a,0);
		alien.addAlien(b,1);
		alien.addAlien(c,2);
		
		int damage = alien.calculateDamage();

		System.out.println("Damage : "+damage);

		Aliens arr[] = alien.getAliens();

	}



}

