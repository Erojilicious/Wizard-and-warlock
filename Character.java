public class Character{
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(String name){
        characterName = name;
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){
 
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

    }

} 