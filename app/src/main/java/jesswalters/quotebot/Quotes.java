package jesswalters.quotebot;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


/*
  Created by Jess Walters on 10/18/2014.
 */
public class Quotes  {




        public  String[] milQuotes = new String[] {
                "Don't tell people how to do things, tell them what to do and let them surprise you with their results. —George S. Patton",
                "Never forget that no military leader has ever become great without audacity. If the leader is filled with high ambition and if he" +
                        " pursues his aims with audacity and strength of will, he will reach them in spite of all obstacles. -Karl von Clausewitz",
                "If the leader is filled with high ambition and if he pursues his aims with audacity and strength of will, he will reach them in spite" +
                        " of all obstacles. -Karl von Clausewitz",
                "Leadership is the art of getting someone else to do something you want done because he wants to do it. -General Dwight D. Eisenhower",
                "You don't lead by hitting people over the head-that's assault, not leadership. -General Dwight D. Eisenhower",
                "There is no type of human endeavor where it is so important that the leader understands all phases of his job as that of the profession" +
                        " of arms. -Major General James Fry",
                "I must follow them. I am their leader. -Andrew Bonar Law",
                "I have to follow them. I am their leader. -Alexandre-Auguste Ledru-Rollin",
                "The final test of a leader is that he leaves behind him in other men the conviction and the will to carry on. -Walter Lippmann",
                "Reason and calm judgment, the qualities specially belonging to a leader. -Tacitus",
                "A leader is a man who had the ability to get other people to do what they don't want to do, and like it. -Harry Truman",
                "You must love soldiers in order to understand them, and understand them in order to lead them. -Henri Turenne",
                "No leader should put troops into the field merely to gratify his own spleen; no leader should fight a battle simply out of pique. " +
                        "But a kingdom that has once been destroyed can never come again into being; nor can the dead ever be brought back to life. Hence the enlightened leader is heedful, and the good leader full of caution. -Sun Tzu",
                "A leader is a man who can adapt principles to circumstances. -General George S. Patton",
                "Lead me, follow me, or get out of my way. -General George Patton",
                "Regard your soldiers as your children, and they will follow you into the deepest valleys. Look on them as your own " +
                    "beloved sons, and they will stand by you even unto death! -Sun Tzu",
                "Though we have heard of stupid haste in war, cleverness has never been seen associated with long delays. -Sun Tzu",
                "It is only one who is thoroughly acquainted with the evils of war that can thoroughly understand the profitable way of carrying it on." +
                        " -Sun Tzu",
                "Bring war material with you from home, but forage on the enemy… use the conquered foe to augment one’s own strength. -Sun Tzu",
                "In the practical art of war, the best thing of all is to take the enemy’s country whole and intact; to shatter and destroy it is not" +
                        " so good. So, too, it is better to recapture an army entire than to destroy it. -Sun Tzu",
                "To fight and conquer in all your battles is not supreme excellence; supreme excellence consists in breaking the enemy’s resistance " +
                        "without fighting. -Sun Tzu",
                "Strength lies not in defense but in attack. -Marquis de Acerba",
                "Battles are sometimes won by generals; wars are nearly always won by sergeants and privates. -F.E. Adcock",
                "Go, therefore, to meet the foe with two objects before you, either victory or death. For men animated by such a spirit must always " +
                        "overcome their adversaries, since they go into battle ready to throw away their lives. -Scipio Africanus",
                "It were better to be a soldier’s widow than a coward’s wife. -Thomas B. Aldrich",
                "I do not fear an army of lions, if they are led by a lamb. I do fear an army of sheep, if they are led by a lion. -Alexander the Great",
                "The human race is in the best condition when it has the greatest degree of liberty. -Dante Aligheri",
                "Bullets cannot be recalled. They cannot be un-invented. But they can be taken out of the gun. -Martin Amis",
                "Choose your friends carefully. Your enemies will choose you. -Yassir Arafat",
                "We trained very hard, but it seemed that every time we were beginning to form into teams we would be reorganized. I was to learn in " +
                        "this life that we tend to meet any situation by reorganizing. And a wonderful method it can be for creating the illusion of" +
                        " progress while producing confusion, inefficiency, and demoralization. -Petronius Arbiter",
                "Courage! Do not fall back; in a little the place will be yours. Watch! When the wind blows my banner against the bulwark, you shall" +
                        " take it. -Joan of Arc",
                "In god’s name! Let us go bravely! -Joan of Arc",
                "He, general or mere captain, who employs every one in the storming of a position can be sure of seeing it retaken by an organized " +
                        "counterattack of four men and a corporal. -Colonel Ardant du Picq",
                "Frederick liked to say that three men behind the enemy were worth fifty in front of him. -Colonel Ardant du Picq",
                "The instruments of battle are valuable only if one knows how to use them. -Colonel Ardant du Picq",
                "The wise learn many things from their enemies. -Aristophanes",
                "We make war that we may live in peace. -Aristotle",
                "He who is to be a good ruler must have first been ruled. -Aristotle",
                "Dalton’s records, carefully preserved for a century, were destroyed during the World War II bombing of Manchester. It is not only" +
                        " the living who are killed in war -Isaac Asimov",
                "The purpose of all war is peace. -Saint Augustine",
                "Threats without power are like powder without ball. -Nathan Bailey",
                "If you’re not gonna pull the trigger, don’t point the gun. -James Baker",
                "We ain’t making no goddamn cornflakes here. -Col. Charlie Beckwith",
                "Will screw them hard, fast, and in an elegant manner. -Major General Haim Bar-Lev",
                "The difficulties of peace are better than the agony of war. -Menahem Begin",
                "Peace is only possible if men cease to place their happiness in the possession of things which cannot be shared. -Julien Benda",
                "All war represents a failure of diplomacy. -Tony Benn",
                "Coward: one who, in a perilous emergency, thinks with his legs. -Ambrose Bierce",
                "Next stop Kuwait! We’re going to go fast and go violently! -Lieutenant-General Walter E. Boomer",
                "Every plan of campaign ought to have several branches and to have been so well thought out that one or other of the said branches " +
                        "cannot fail of success. -Bourchet",
                "A soldier is he whose blood makes the glory of the general. -Henry G. Bohn",
                "War is like love; it always finds a way -Bertolt Brecht",
                "I say violence is necessary. It is as American as cherry pie. -H. Rap Brown",
                "Every man is his own greatest enemy, and as it were his own executioner. -Sir Thomas Browne",
                "The thanks of the infantry, in my opinion, must be treasured more by every artilleryman than all decorations and citations. -Colonel Georg Bruchmuller",
                "The onset of bayonets in the hands of the valiant is irresistible. -Major-General John Burgoyne",
                "Success can not be administrated -Admiral Arleigh Burke",
                "The only thing necessary for the triumph of evil is for good men to do nothing. -Edmund Burke",
                "I want to record my strong conviction that the risks entailed by nuclear weapons are far too great to leave the prospects of their " +
                        "elimination solely within the province with governments. -General Lee Butler",
                "Nothing concentrates the military mind so much as the discovery that you have walked into an ambush. -Thomas Packenham",
                "Good logistics is combat power -Lieutenant-General William G. Pagonis",
                "Intuition is often crucial in combat, and survivors learn not to ignore it. -Col F.F. Parry",
                "Part of the happiness of life consists not in fighting battles, but in avoiding them. A masterly retreat is in itself a victory. -Norman Vincent Peale",
                "No man is fit to command another that cannot command himself. - William Penn",
                "Soldiers’ bellies are not satisfied with empty promises and hopes. -Peter the Great",
                "In the moment of action remember the value of silence and order. -Phormio of Athens",
                "I don’t care how they dress so long as they mind their fighting. -Sir Thomas Picton",
                "A force engaged is out of the hand of its commander -Colonel Charles Ardant du Picq",
                "I am surrounded by fearful odds that will overcome me and my valiant men; but I am pleased to die fighting for my beloved country. -Gen. Gregorio H. Del Pilar",
                "If I were an American, as I am an Englishman, while a foreign troop was landed in my country I never would lay down my arms, never! Never! Never! –William Pitt",
                "Only the dead have seen the end of war. -Plato",
                "The only thing necessary for the triumph of evil is for good men to do nothing. -Edmund Burke",
                "A ship without Marines is like a garment without buttons. -Admiral David D. Porter",
                "Over the years, the United States has sent many of its fine young men and women into great peril to fight for freedom beyond our borders. The only amount of " +
                        "land we have ever asked for in return is enough to bury those that did not return. -Collin Powell",
                "Success is how high you bounce when you hit bottom. -General George Patton Jr",
                "Lead me, follow me, or get out of my way. -General George Patton ",
                "Courage is fear holding on a minute longer. -General George Patton ",
                "If a man does his best, what else is there? -General George Patton Jr",
                "If everyone is thinking alike, someone isn’t thinking. -General George Patton Jr",
                "Watch what people are cynical about, and one can often discover what they lack. -General George Patton Jr",
                "You’re never beaten until you admit it. -General George Patton Jr",
                "It is only by doing things others have not that one can advance. -General George Patton Jr",
                "A pint of sweat will save a gallon of blood. -General George Patton Jr",
                "You must do your damdest and win. -General George S. Patton",
                "The person who knows how will always have a job. The person who know why will always be his boss. -Diane Ravitch",
            "We should declare war on North Vietnam. . . .We could pave the whole country and put parking strips on it, and still be home by Christmas. -Ronald Reagan",
            "Today we did what we had to do. They counted on America to be passive. They counted wrong. -Ronald Reagan",
            "Courage is doing what you’re afraid to do. There can be no courage unless you’re scared. -Eddie Rickenbacker",
            "The more you sweat in peace, the less you bleed in war. -Hyman G. Rickover",
            "Diplomats are just as essential to starting a war as soldiers are for finishing it… You take diplomacy out of war, and the thing would fall flat in a week. - Will Rogers",
            "The objective is not the occupation of a geographical position, but the destruction of the enemy force. -General Piotr A. Rumyantsev",
            "A riot is a spontaneous outburst. A war is subject to advance planning. -Richard M. Nixon",
            "In a man to man fight the winner is the one who puts an extra round in his magazine. -Field Marshal Erwin Rommel",
            "The art of concentrating strength at one point, forcing a breakthrough, rolling up and securing the flanks on either side, and then penetrating like lightning deep into his rear, before the enemy has time to react. -Field Marshal Erwin Rommel",
            "Fools say that they learn by experience. I prefer to profit by others experience. -Otto Von Bismarck",
            "Anyone who has ever looked into the glazed eyes of a soldier dying on the battlefield will think hard before starting a war. -Otto Von Bismarck",
            "Be polite; write diplomatically; even in a declaration of war one observes the rules of politeness. -Otto Von Bismarck",
            "The main thing is to make history, not to write it. -Otto Von Bismarck",
            "In war there is no substitute for victory. -General Douglas Macarthur",
            "I Shall Return! -General Douglas Macarthur",
            "Nine times of ten an army has been destroyed because its supply lines have been severed. -General Douglas Macarthur",
            "There is no security in this life. There is only opportunity. -General Douglas MacArthur",
            "In war, you win or lose, live or die – and the difference is an eyelash. -General Douglas Macarthur",
            "The best luck of all is the luck you make for yourself. -General Douglas MacArthur",
            "You are remembered for the rules you break. -General Douglas MacArthur",
            "The secret of war lies in the communications. -Napoleon Bonaparte",
            "Never interrupt your enemy when he is making a mistake. -Napoleon Bonaparte",
            "It is better to have a known enemy than a forced ally. -Napoleon Bonaparte",
            "There are but two powers in the world, the sword and the mind. In the long run the sword is always beaten by the mind. -Napoleon Bonaparte",
            "A military man can scarcely pride himself on having smitten a sleeping enemy, it is more a matter of shame, simply, for the one smitten. -Admiral Isoroku Yamamoto",
            "My troops may fail to take a position, but are never driven from one! -General Thomas 'Stonewall' Jackson",

};

        public String[] movQuotes = new String[] {
                "Why are you trying so hard to fit in when you were born to stand out? -(What a girl wants)",
                "Oh yes, the past can hurt. But you can either run from it, or learn from it. -Rafiki (The Lion King)",
                "Life moves pretty fast. If you don't stop and look around once in a while, you could miss it. -Ferris Bueller (Ferris Beuller's day off)",
                "Do, or do not. There is no “try”. -Yoda (Star Wars)",
                "We are who we choose to be. -Green Goblin (Spider-Man)",
                "Don’t let anyone ever make you feel like you don’t deserve what you want. -Heath Ledger (10 Things I hate about you)",
                "I don’t regret the things I’ve done, but those I did not do. -(Empire Records)",
                "It is not our abilities that show what we truly are… it is our choices. -Dumbledore (Harry Potter and the Chamber of Secrets)",
                "You cannot live your life to please others. The choice must be yours. -White Queen (Alice in Wonderland)",
                "All we have to decide is what to do with the time that is given to us. -(Lord of the Rings: The Fellowship of the Ring)",
                "It’s what you do right now that makes a difference. -(Black Hawk Down)",
                "Our lives are defined by opportunities, even the ones we miss. -(Curious Case of Benjamin Button)",
                "Great men are not born great, they grow great. -Mario Puzo (The Godfather)",
                "I know what I have to do now, I’ve got to keep breathing because tomorrow the sun will rise. Who knows what the tide could bring? -(Cast Away)",
                "Children of the night! What music they make. -Bela Lugosi (Dracula)",
                "Carpe diem. Seize the day, boys. -Robin Williams (Dead Poets Society)",
                "You get nothing! You lose! Good day sir! -Gene Wilder (Willy Wonka & The Chocolate Factory)",
                "I'm the king of the world! -Leonardo DiCaprio (Titanic)",
                "Yippee ki-ya! -Bruce Willis (Die Hard)",
                "Follow the money. -Hal Holbrook (All the President's Men)",
                "I'm not bad, I'm just drawn that way. -Kathleen Turner (Who Framed Roger Rabbit)",
                "Open the pod bay doors, HAL. -Dave (2001: A Space Odyssey)",
                "I'm sorry, Dave. I can't do that. -Hal (2001: A Space Odyssey)",
                "This one time at band camp! -Michelle (American Pie)",
                "My name is Inigo Montoya. You killed my father. Prepare to die -Inigo Montoya (The Princess Bride)",
                "Hello, gorgeous -Barbra Streisand (Funny Girl)",
                "To infinity and beyond! -Buzz Lightyear (Toy Story)",
                "One morning I shot an elephant in my pajamas. How he got in my pajamas, I'll never know -Groucho Marx (Animal Crackers)",
                "Why so serious? -The Joker (The Dark Knight)",
                "Ever dance with the devil in the pale moonlight? -The Joker (Batman)",
                "It's only a flesh wound -The Black Knight (Monty Python & The Holy Grail)",
                "The first rule of Fight Club: You do not talk about Fight Club. The second rule of Fight Club: You do *not* talk about Fight Club -Brad Pitt (Fight Club)",
                "Nobody puts baby in the corner. -Patrick Swayze (Dirty Dancing)",
                "Get your stinkin' paws off me, you damned dirty ape! -Charlton Heston (Planet of the Apes)",
                "Snap out of it! -Cher (Moonstruck)",
                "That'll be the day -John Wayne (The Searchers)",
                "What's in the box? -Brad Pitt (Se7en)",
                "I'm out of order? You're out of order! This whole court is out of order! -Al Pacino (And Justice for All)",
                "We rob banks -(Bonnie and Clyde)",
                "Bueller? Bueller? -Ben Stein (Ferris Bueller's Day Off)",
                "Donnie, you're out of your element -John Goodman (The Big Lebowski)",
                "The dude abides. -The Dude (The Big Lebowski)",
                "Houston we have a problem. -Tom Hanks (Apollo 13)",
                "You can't fight in here, this is the war room! -Peter Sellers (Dr. Strangelove)",
                "They're here! -Heather O'Rourke (Poltergeist)",
                "It's alive! -Colin Clive (Frankenstein)",
                "Show me the money! -Cuba Gooding Jr. (Jerry Maguire)",
                "You had me at 'hello. -Renee Zellweger (Jerry Maguire)",
                "Well, nobody's perfect. -Joe E. Brown (Some Like it Hot)",
                "Greed, for lack of a better word, is good. -Michael Douglas (Wall Street)",
                "There’s three things in this world that you need: Respect for all kinds of life, a nice bowel movement on a regular basis, and a navy blazer. -Robin Williams (The FisherKing)",
                "You don’t know about real loss because it only occurs when you’ve loved something more than you love yourself. I doubt you’ve ever dared to love anybody that much. " +
                        "-Robin Williams (Good Will Hunting)",
                "Hi, everyone. I'm Olaf and I like warm hugs! -Olaf (Frozen)",
                "Me I'm dishonest, and a dishonest man you can always trust to be dishonest. Honestly it's the honest ones you have to watch out for, you never can predict " +
                        "if they're going to do something incredibly stupid. -Orlando Bloom (Pirates of the Carribbean)",
                "Brick, I've been meaning to talk to you about that. You should find yourself a safe house or a relative close by because you're probably wanted for murder. " +
                        "-Will Ferrell (Anchorman)",
                "My name's Forrest Gump, people call me Forrest Gump. -Tom Hanks (Forrest Gump)",
                "On top of spaghetti all covered in. Corn? I don't remember having any corn. -Mike Meyers (Austin Powers in Goldmember)",
                "If there is anything that this horrible tragedy can teach us, it's that a male model's life is a precious, precious commodity. Just because we have chiseled abs and " +
                        "stunning features, it doesn't mean that we too can't not die in a freak gasoline fight accident. -Ben Stiller (Zoolander)",
                "“I shall call him Squishy and he shall be mine and he shall be my Squishy. Come on, Squishy Come on, little Squishy. -Dory (Finding Nemo)",
                "Very nice, very nice! How much? -Borat (Borat)",
                "Let me ask you something, and I'm not trying to be funny here. Are you sure he's not a midget with a learning disability? -Will Ferrell (Anchorman 2)",
                "Is there any way you could lend me some money? Maybe twenty million dollars. -Sacha Baron Cohen (The Dictator)",
                " I'm going to miss you monkey. I wish monkeys could Skype. Maybe one day. -Zach Galifanakis (Hangover Part 2)",
                "I can't believe my daddy is dead. I can think of so many people I would rather have died first, like my mother. -Zach Galifanakis (Hangover Part 3)",
                "Forget it Jake, it's Chinatown. -Buck Henry (Chinatown)",
                "I feel the need...the need for speed -Tom Cruise (Top Gun)",
                "Mojo! -Mike Myers (Austin Powers: International Man of Mystery)",
            "Made it ma! Top of the world! -James Cagney (White Heat)",
            "Toga! Toga! -John Belushi (Animal House)",
            "You do know how to whistle, don't you Steve? You just put your lips together, and blow. -Lauren Bacall (To Have and Have Not)",
            "They call me Mr. Tibbs! -Sidney Poitier (In the Heat of the Night)",
            "Cinderella story, outta nowhere, a former greenskeeper, now about to become the Masters champion. It looks like a mirac - it's in the hole! -Bill Murray (Caddyshack)",
            "Get busy living, or get busy dying -Morgan Freeman (The Shawshank Redemption)",
            "You'll shoot your eye out! -Melinda Dillon (A Christmas Story)",
            "Say hello to my little friend! -Al Pacino (Scarface)",
            "Every time a bell rings, an angel gets his wings. -Karolyn Grimes (It's a Wonderful Life)",
            "Attica! Attica! -Al Pacino (Dog Day Afternoon)",
            "There's no crying in baseball. -Tom Hanks (A League of Their Own)",
            "Yo, Adrian! -Sylvester Stallone (Rocky)",
            "Hey Stella! -Marlon Brando (A Streetcar Named Desire)",
            "I don't have to show you any stinkin badges! -Alfonso Bedoya (The Treasure of the Sierra Madre)",
            "Mrs. Robinson, you're trying to seduce me. -Dustin Hoffman (The Graduate)",
            "Life is like a box of chocolates. -Tom Hanks (Forrest Gump)",
            "Love means never having to say you're sorry. -Ali MacGraw (Love Story)",
            "I see dead people. -Haley Joel Osment (The Sixth Sense)",
            "E.T. phone home. -Debra Winger (E.T. The Extra Terrestrial)",
            "The...uh...stuff that dreams are made of. -Humphrey Bogart (The Maltese Falcon)",
            "It puts the lotion on its skin. -Ted Levine (The Silence of the Lambs)",
            "A boy's best friend is his mother. -Anthony Perkins (Psycho)",
            "\"Surely you can't be serious.\" \"I am serious, and don't call me Shirley.\" -Robert Hays & Leslie Nielsen (Airplane!)",
            "I'll be back. -Arnold Swarzenegger (The Terminator)",
            "Hasta la vista baby. -Arnold Swarzenegger (The Terminator)",
            "If you build it, he will come. -Phil Alden Robinson (Field of Dreams)",
            "I love the smell of napalm in the morning. -Robert Duvall (Apocalypse Now)",
            "Rosebud. -Orson Welles (Citizen Kane)",
            "Bond, James Bond. -Sean Connery (Dr. No)",
            "A martini, shaken not stirred. -Sean Connery (Dr. No)",
            "I'm walking here! I'm walking here! -Dustin Hoffman (Midnight Cowboy)",
            "Here's Johnny! -Jack Nicholson (The Shining)",
            "What we've got here is a failure to communicate. -Strother Martin (Cool Hand Luke)",
            "My precious!! -Andy Serkis (The Lord of the Rings)",
            "May the force be with you. --Harrison Ford (Star Wars)",
            "I am your father. -James Earl Jones (Star Wars)",
            "I'm mad as hell and I'm not gonna take this anymore! -Peter Finch (Network)",
            "Alright, Mr. Demille, I'm ready for my close-up. -Gloria Swanson (Sunset Blvd.)",
            "I am big. It's the pictures that got small. -Gloria Swanson (Sunset Blvd.)",
            "You can't handle the truth! -Jack Nicholson (A Few Good Men)",
            "You talkin' to me? -Robert DeNiro (Taxi Driver)",
            "I'll have what she's having. -Estelle Reiner (When Harry Met Sally)",
            "You've got to ask yourself one question: 'Do I feel lucky?' Well, do ya, punk? -Clint Eastwood (Dirty Harry)",
            "Go ahead, make my day. -Clint Eastwood (Sudden Impact)",
            "Fasten your seatbelts. It's going to be a bumpy night. -Bette Davis (All About Eve)",
            "You're gonna need a bigger boat. -Roy Scheider (Jaws)",
            "Frankly my dear, I don't give a damn! -Clark Gable (Gone With the Wind)",
            "You don't understand! I coulda had class! I coulda been a contender! I coulda been somebody. Instead of a bum, which is what I am, let's face it. It was you, Charlie. It was you, Charlie. -Marlon Brando (On the Waterfront)",
            "I'm gonna make him an offer he can't refuse. -(The Godfather)",
            "It's not personal, it's strictly business. -(The Godfather)",
            "Keep your friends close, but your enemies closer. -(The Godfather)",
            "I know it was you, Fredo, you broke my heart. -(The Godfather)",
            "Just when I thought I was out, they pull me back in! -(The Godfather)",
            "Here's lookin' at you kid. -(Casablanca)",
            "Of all the gin joints in all the towns in all the world, she walks into mine. -(Casablanca)",
            "Play it Sam! -(Casablanca)",
            "Round up the usual suspects. -(Casablanca)",
            "We'll always have Paris. -(Casablanca)",
            "I think this is the beginning of a beautiful friendship. -(Casablanca)",
            "Come Patsy! -King Arthur (Montey Python and the Quest for the Holy Grail)"


};

        public String[] histQuotes = new String[] {
                "I would rather belong to a poor nation that was free than to a rich nation that had ceased to be in love with liberty. –Woodrow Wilson",
                "Wherever you go, go with all your heart. -Confucious",
                "Hope is a walking dream. -Aristotle",
                "Action is the foundational key to success. -Pablo Picasso",
                "Do one thing everyday that scares you. -Elenor Roosevelt",
                "Eighty percent of success is showing up. -Woody Allen",
                "We are what we repeatedly do. Excellence, therefore, is not an act but a habit. -Aristotle",
                "We are still masters of our fate. We are still captains of our souls. -Winston Churchill",
                "Knowing is not enough; we must apply. Willing is not enough; we must do. -Johann Wolfgang von Goethe",
                "Try not to become a man of success but a man of value. -Albert Einstein",
                "If you have built castles in the air, your work need not be lost; that is where they should be. Now put foundations under them. -Henry David Thoreau",
                "If you would create something, you must be something. -Johann Wolfgang von Goethe",
                "Happiness depends upon ourselves. -Aristotle",
                "Take all the swift advantage of the hours. -William Shakepeare",
                "Opportunity, sooner or later, comes to all who work and wish. -Lord Stanley",
                "There's a time for all things. -William Shakespeare",
                "A good opportunity is seldom presented, and is easily lost. -Syrus",
                "Opportunity is missed by most people because it is dressed in overalls and looks like work. -Thomas A. Edison",
                "Present opportunities are not to be neglected; they rarely visit us twice. -Voltaire",
                "Occasions are rare: and those who know how to seize upon them are rarer. -H. W. Shaw",
                "I hope we once again have reminded people that man is not free unless government is limited. There’s a clear cause and effect here that " +
                        "is as neat and predictable as a law of physics: As government expands, liberty contracts. –Ronald Reagan",
                "When one side only of a story is heard and often repeated, the human mind becomes impressed with it insensibly. –George Washington",
                "If national pride is ever justifiable or excusable it is when it springs, not from power or riches, grandeur or glory, but from" +
                        " conviction of national innocence, information, and benevolence. -John Adams",
                "Think about every problem, every challenge, we face. The solution to each starts with education. –George H.W. Bush",
                "Mankind must put an end to war — or war will put an end to mankind. –John F. Kennedy",
                "A president’s hardest task is not to do what is right, but to know what is right. –Lyndon Johnson",
                "Being a politician is a poor profession. Being a public servant is a noble one. –Herbert Hoover",
                "This country, with its institutions, belongs to the people who inhabit it. Whenever they shall grow weary of the existing government," +
                        " they can exercise their constitutional right of amending it or their revolutionary right to dismember or overthrow it. –Abraham Lincoln",
                "I pity the man who wants a coat so cheap that the man or woman who produces the cloth or shapes it into a garment will starve in the " +
                        "process. –Benjamin Harrison",
                "We the people tell the government what to do, it doesn’t tell us. –Ronald Reagan",
                "No government is perfect. One of the chief virtues of a democracy, however, is that its defects are always visible and under democratic" +
                        " processes can be pointed out and corrected. –Harry S. Truman",
                "For myself I am an optimist - it does not seem to be much use being anything else. —Sir Winston Churchill",
                "Moral indignation is jealousy with a halo. -H. G. Wells (1866-1946)",
                "Glory is fleeting, but obscurity is forever. -Napoleon Bonaparte (1769-1821)",
                "The whole problem with the world is that fools and fanatics are always so certain of themselves, and wiser people so full " +
                        "of doubts. -Bertrand Russell (1872-1970)",
                "Victory goes to the player who makes the next-to-last mistake. -Savielly Grigorievitch Tartakower (1887-1956)",
                "His ignorance is encyclopedic. -Abba Eban (1915-2002)",
                "Opportunities multiply as they are seized. -Sun Tzu",
                "A consensus means that everyone agrees to say collectively what no one believes individually. -Abba Eban (1915-2002)",
                "Political correctness is tyranny with manners. -Charlton Heston (1924-2008)",
                "You can avoid reality, but you cannot avoid the consequences of avoiding reality. -Ayn Rand (1905-1982)",
                "Not everything that can be counted counts, and not everything that counts can be counted. -Albert Einstein (1879-1955)",
                "Only two things are infinite, the universe and human stupidity, and I'm not sure about the former. -Albert Einstein (1879-1955)",
                "A lie gets halfway around the world before the truth has a chance to get its pants on. -Sir Winston Churchill (1874-1965)",
                "The pessimist sees difficulty in every opportunity. The optimist sees opportunity in every difficulty. —Winston Churchill",
                "I do not feel obliged to believe that the same God who has endowed us with sense, reason, and intellect has intended " +
                        "us to forgo their use. -Galileo Galilei (1564-1642)",
                "The artist is nothing without the gift, but the gift is nothing without work. -Emile Zola (1840-1902)",
                "The difference between fiction and reality? Fiction has to make sense. -Tom Clancy",
                "The full use of your powers along lines of excellence. -John F. Kennedy (definition of happiness)",
                "I'm living so far beyond my income that we may almost be said to be living apart. -E E Cummings (1894-1962)",
                "Give me a museum and I'll fill it. -Pablo Picasso (1881-1973)",
                "Research is what I'm doing when I don't know what I'm doing. -Wernher Von Braun (1912-1977)",
                "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything " +
                        "is a miracle. -Albert Einstein",
                "I find that the harder I work, the more luck I seem to have. -Thomas Jefferson (1743-1826)",
                "Whether you think that you can, or that you can't, you are usually right. -Henry Ford (1863-1947)",
                "Don't stay in bed, unless you can make money in bed. -George Burns (1896-1996)",
                "Nothing in the world is more dangerous than sincere ignorance and conscientious stupidity. -Martin Luther King Jr.",
                "A mathematician is a device for turning coffee into theorems. -Paul Erdos (1913-1996)",
                "Problems worthy of attack prove their worth by fighting back. -Paul Erdos (1913-1996)",
                "Happiness equals reality minus expectations. -Tom Magliozzi (1937-2014)",
                "Try to learn something about everything and everything about something. -Thomas Henry Huxley (1825-1895)",
                "If you can't get rid of the skeleton in your closet, you'd best teach it to dance. -George Bernard Shaw (1856-1950)",
                "But at my back I always hear Time's winged chariot hurrying near. -Andrew Marvell (1621-1678)",
                "Good people do not need laws to tell them to act responsibly, while bad people will find a way around the laws. -Plato (427-347 B.C.)",
                "The power of accurate observation is frequently called cynicism by those who don't have it. -George Bernard Shaw (1856-1950)",
                "Whenever I climb I am followed by a dog called 'Ego'. -Friedrich Nietzsche (1844-1900)",
                "Everybody pities the weak; jealousy you have to earn. -Arnold Schwarzenegger",
                "Against stupidity, the gods themselves contend in vain. -Friedrich von Schiller (1759-1805)",
                "Human history becomes more and more a race between education and catastrophe. -H. G. Wells (1866-1946)",
                "Talent does what it can; genius does what it must. -Edward George Bulwer-Lytton (1803-1873)",
                "The difference between 'involvement' and 'commitment' is like an eggs-and-ham breakfast: the chicken was 'involved' " +
                        "- the pig was 'committed'. -Unknown",
                "If you are going through hell, keep going. -Sir Winston Churchill",
                "Life isn't about waiting for the storm to pass; it's about learning to dance in the rain. -Vivian Greene",
                "He who has a 'why' to live, can bear with almost any 'how'. -Friedrich Nietzsche (1844-1900)",
                "Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. So throw " +
                        "off the bowlines. Sail away from the safe harbour. Catch the trade winds in your sails. Explore. Dream. Discover. —Mark Twain",
                "The greatest danger for most of us is not that our aim is too high and we miss it, but that it is too low and we reach" +
                        " it. —Michaelangelo",
                "A jug fills by the drop. -Buddha",
                "The best revenge is massive success. -Frank Sinatra",
                "I am ready to meet my Maker. Whether my Maker is prepared for the great ordeal of meeting me is another matter." +
                        " -Sir Winston Churchill",
                "It does not matter how slowly you go as long as you do not stop. -Confucious",
                "Men are born to succeed, not fail. -Henry David Thoreau",
                "If you're going through hell, keep going. —Winston Churchill",
                "I shall not waste my days in trying to prolong them. -Ian L. Fleming (1908-1964)",
                "When you do the common things in life in an uncommon way, you will command the attention of the world." +
                        " -George Washington Carver (1864-1943)",
                "Once you eliminate the impossible, whatever remains, no matter how improbable, must be the truth. " +
                        "-Sir Arthur Conan Doyle (1859-1930)",
                "Black holes are where God divided by zero. -Steven Wright",
                "I've had a wonderful time, but this wasn't it. -Groucho Marx (1895-1977)",
                "It's kind of fun to do the impossible. -Walt Disney (1901-1966)",
                "The optimist proclaims that we live in the best of all possible worlds, and the pessimist fears this is true. -James Branch Cabell",
                "A friendship founded on business is better than a business founded on friendship. -John D. Rockefeller (1874-1960)",
                "All are lunatics, but he who can analyze his delusion is called a philosopher. -Ambrose Bierce (1842-1914)",
                "You can only find truth with logic if you have already found truth without it. -Gilbert Keith Chesterton (1874-1936)",
                "To love oneself is the beginning of a lifelong romance. -Oscar Wilde (1854-1900)",
                "Knowledge speaks, but wisdom listens. -Jimi Hendrix",
                "A clever man commits no minor blunders. -Goethe (1749-1832)",
                "Argue for your limitations, and sure enough they're yours. -Richard Bach",
                "Sleep is an excellent way of listening to an opera. -James Stephens (1882-1950)",
                "The nice thing about being a celebrity is that if you bore people they think it's their fault. -Henry Kissinger (1923-)",
                "Education is a progressive discovery of our own ignorance. -Will Durant",
                "I have often regretted my speech, never my silence. -Xenocrates (396-314 B.C.)",
                "I'll sleep when I'm dead. -Warren Zevon (1947-2003)",
                "There are people in the world so hungry, that God cannot appear to them except in the form of bread. -Mahatma Gandhi (1869-1948)",
                "Everyone is a genius at least once a year; a real genius has his original ideas closer together. -Georg Lichtenberg (1742-1799)",
                "Success usually comes to those who are too busy to be looking for it. -Henry David Thoreau (1817-1862)",
                "While we are postponing, life speeds by. -Seneca (3BC - 65AD)",
                "My advice to you is get married: if you find a good wife you'll be happy; if not, you'll become a philosopher. -Socrates (470-399 B.C.)",
                "Advice is what we ask for when we already know the answer but wish we didn't. -Erica Jong (1942-)",
                "When you have to kill a man, it costs nothing to be polite. -Sir Winston Churchill",
                "We make a living by what we get. We make a life by what we give. —Winston Churchill",
                "Any man who is under 30, and is not a liberal, has no heart; and any man who is over 30, and is not a conservative, " +
                        "has no brains. -Sir Winston Churchill",
                "The opposite of a correct statement is a false statement. The opposite of a profound truth may well be another profound " +
                        "truth. -Niels Bohr (1885-1962)",
                "We all agree that your theory is crazy, but is it crazy enough? -Niels Bohr (1885-1962)",
                "When I am working on a problem I never think about beauty. I only think about how to solve the problem. But when I have " +
                        "finished, if the solution is not beautiful, I know it is wrong. -Buckminster Fuller (1895-1983)",
                "In science one tries to tell people, in such a way as to be understood by everyone, something that no one ever knew before." +
                        " But in poetry, it's the exact opposite. -Paul Dirac (1902-1984)",
                "Make everything as simple as possible, but not simpler. -Albert Einstein",
                "I love Mickey Mouse more than any woman I have ever known. -Walt Disney (1901-1966)",
                "Sometimes a scream is better than a thesis. -Ralph Waldo Emerson (1803-1882)",
                "There is no sincerer love than the love of food. -George Bernard Shaw (1856-1950)",
                "Friends may come and go, but enemies accumulate. -Thomas Jones",
                "You can get more with a kind word and a gun than you can with a kind word alone. -Al Capone (1899-1947)",
                "Men have become the tools of their tools. -Henry David Thoreau (1817-1862)"
        };

        public String[] pQuotes = new String[] {
                "Happiness is not a certain set of circumstances, but a certain set of attitudes. -Jack Zabinski",
                "Life is like photography, you have to use the negative to develop. -Robert Powell",
                "The journey of a thousand miles must begin with a small step. —Chinese Proverb",
                "The gem cannot be polished without friction, nor man perfected without trials. —Chinese proverb",
                "Experience is a hard teacher because she gives the test first, the lesson afterward. —Chinese Proverb",
                "Vision without action is a daydream; action without vision is a nightmare. —Japanese proverb",
                "One who smiles rather than angers is always stronger -- Chinese Proverb",
                "Fall seven times; stand up eight. -Japanese Proverb",
                "A smooth sea never made a skilled mariner. —English proverb",
                "If you are seeking revenge, start by digging two graves. —Ancient Chinese proverb",
                "The soul would have no rainbow if the eyes had no tears. —Native American proverb",
                "Tension is who you think you should be, relaxation is who you are. —Ancient Chinese Proverb",
                "If you want to go quickly, go alone. If you want to go far, go together. —African proverb",
                "When someone's character seems impossible to fathom, observe his friends. —Japanese proverb",
                "Deal with the faults of others as gently as with your own. —Chinese proverb",
                "The man who has confidence in himself gains the confidence of others. -Hasidic Proverb",
                "Choose a job you love, and you will never have to work a day in your life. -Proverb",
                "Two wrongs don't make a right. -English Proverb",
                "The pen is mightier than the sword. -English Proverb",
                "When in Rome, do as the Romans. -English Proverb",
                "The squeaky wheel gets the grease. -English Proverb",
                "When the going gets tough, the tough get going. -English Proverb",
                "No man is an island. -English Proverb",
                "Fortune favors the bold. -English Proverb",
                "People who live in glass houses should not throw stones. -English Proverb",
                "Hope for the best, but prepare for the worst. -English Proverb",
                "Better late than never. -English Proverb",
                "Birds of a feather flock together. -English Proverb",
                "A picture is worth a thousand words. -English Proverb",
                "Keep your friends close and your enemies closer. -English Proverb",
                "There's no such thing as a free lunch. -English Proverb",
                "Discretion is the greater part of valor. -English Proverb",
                "The early bird catches the worm. -English Proverb",
                "Never look a gift horse in the mouth. -English Proverb",
                "You can't make an omelet without breaking a few eggs. -English Proverb",
                "A watched pot never boils. -English Proverb",
                "Beggars can't be choosers. -English Proverb",
                "Actions speak louder than words. -English Proverb",
                "If it ain't broke, don't fix it. -English Proverb",
                "Practice makes perfect. -English Proverb",
                "Easy come, easy go. -English Proverb",
                "Don't bite the hand that feeds you. -English Proverb",
                "All good things must come to an end. -English Proverb",
                "If you can't beat 'em, join 'em. -English Proverb",
                "One man's trash is another man's treasure. -English Proverb",
                "There's no time like the present. -English Proverb",
                "Beauty is in the eye of the beholder. -English Proverb",
                "Necessity is the mother of invention. -English Proverb",
                "A penny saved is a penny earned. -English Proverb",
                "You can't judge a book by its cover. -English Proverb",
                "Good things come to those who wait. -English Proverb",
                "Don't put all your eggs in one basket. -English Proverb",
                "Two heads are better than one. -English Proverb",
                "Do unto others as you would have them do unto you. -English Proverb",
                "A chain is only as strong as its weakest link. -English Proverb",
                "Honesty is the best policy. -English Proverb",
                "Absence makes the heart grow fonder. -English Proverb",
                "You can lead a horse to water, but you can't make him drink. -English Proverb",
                "Don't count your chickens before they hatch. -English Proverb",
                "If you want something done right, you have to do it yourself. -English Proverb",
                "To believe in one's dreams is to spend all of one's life asleep. -Chinese Proverb",
                "He who asks is a fool for five minutes, but he who does not ask remains a fool forever. -Chinese Proverb",
                "If you are planning for a year, sow rice; if you are planning for a decade, plant trees; if you are planning for a lifetime, educate people. -Chinese Proverb",
                "If you are patient in one moment of anger, you will escape a hundred days of sorrow. -Chinese Proverb",
                "He who cannot agree with his enemies is controlled by them. -Chinese Proverb",
                "You cannot prevent the birds of sorrow from flying over your head, but you can prevent them from building nests in your hair. -Chinese Proverb",
                "Better to light a candle than to curse the darkness. -Chinese Proverb",
                "A wise man makes his own decisions, an ignorant man follows the public opinion. -Chinese Proverb",
                "Deep doubts, deep wisdom; small doubts, little wisdom. -Chinese Proverb",
                "A great fortune depends on luck, a small one on diligence. -Chinese Proverb",
                "If you must play, decide upon three things at the start: the rules of the game, the stakes, and the quitting time. -Chinese Proverb",
                "Heaven has a road, but no one travels it; Hell has no gate but men will dig to get there. -Chinese Proverb",
                "One joy scatters a hundred griefs. -Chinese Proverb",
                "Give a man a fish, and he'll eat for a day. Teach him how to fish and he'll eat forever. -Chinese Proverb",
                "Learning is a treasure that will follow its owner everywhere. -Chinese Proverb",
                "Pleasure for one hour, a bottle of wine. Pleasure for one year a marriage; but pleasure for a lifetime, a garden. -Chinese Proverb",
                "Quarreling is like cutting water with a sword. -Chinese Proverb",
                "Forethought is easy, repentance hard. -Chinese Proverb",
                "He who is not satisfied with himself will grow; he who is not sure of his own correctness will learn many things. -Chinese Proverb",
                "A truly great man never puts away the simplicity of a child. -Chinese Proverb",
                "Teachers open the door, but you must enter by yourself. -Chinese Proverb",
                "A clever person turns great troubles into little ones and little ones into none at all. -Chinese Proverb",
                "He who could foresee affairs three days in advance would be rich for thousands of years. -Chinese Proverb",
                "One step at a time is good walking. -Chinese Proverb",
                "He who treads softly goes far. -Chinese Proverb",
                "If we do not change our direction, we are likely to end up where we are headed. -Chinese Proverb",
                "Do not anxiously hope for that which is not yet come; do not vainly regret what is already past. -Chinese Proverb",
                "The gem cannot be polished without friction, nor man perfected without trials. -Chinese Proverb",
                "He who sacrifices his conscience to ambition burns a picture to obtain the ashes. -Chinese Proverb",
                "Man who waits for roast duck to fly into mouth must wait very, very long time. -Chinese proverb.",
                "If you don't want anyone to know it, don't do it. -Chinese Proverb",
                "The greatest conquerer is he who overcomes the enemy without a blow. -Chinese Proverb",
                "Great souls have wills; feeble ones have only wishes. -Chinese Proverb",
                "Even monkeys fall from trees. -Japanese Proverb",
                "A fog cannot be dispelled by a fan. -Japanese Proverb",
                "A good sword is the one left in its scabbard. -Japanese Proverb",
                "A man in love mistakes a pimple for a dimple. -Japanese Proverb",
                "A pig used to dirt turns its nose up at rice. -Japanese Proverb",
                "A round egg can be made square according to how you cut it; words would be harsh according to how you speak them. -Japanese Proverb",
                "A single arrow is easily broken, but not ten in a bundle. -Japanese Proverb",
                "Adversity is the foundation of virtue. -Japanese Proverb",
                "An accomplishment sticks to a person. -Japanese Proverb",
                "Better go without medicine than call in an unskilled physician. -Japanese Proverb",
                "Darkness reigns at the foot of the lighthouse. -Japanese Proverb",
                "Deceive the rich and powerful if you will, but don't insult them. -Japanese Proverb",
                "Even a sheet of paper has two sides. -Japanese Proverb",
                "Even a thief takes ten years to learn his trade. -Japanese Proverb",
                "First the man takes a drink, then the drink takes a drink, then the drink takes the man. -Japanese Proverb",
                "If a man be great, even his dog will wear a proud look. -Japanese Proverb",
                "If you believe everything you read, better not read. -Japanese Proverb",
                "If you understand everything, you must be misinformed. -Japanese Proverb",
                "It is a beggar's pride that he is not a thief. -Japanese Proverb",
                "Take only memories, Leave only footprints -Native American Proverb",
                "Don't be afraid to cry. It will free your mind of sorrowful thoughts. -Hopi Proverb",
                "Day and night cannot dwell together. -Duwamish Proverb",
                "It is better to have less thunder in the mouth and more lightning in the hand. -Apache Proverb",
                "They are not dead who live in the hearts they leave behind. -Tuscarora Proverb",
                "Before eating, always take time to thank the food. -Arapaho Proverb",
                "When we show our respect for other living things, they respond with respect for us. -Arapaho Proverb",
                "If we wonder often, the gift of knowledge will come. -Arapaho Proverb",
                "Those that lie down with dogs, get up with fleas. -Blackfoot Proverb",
                "When you were born, you cried and the world rejoiced. Live your life so that when you die, the world cries and you rejoice. -Cherokee Proverb",
                "Those who have one foot in the canoe, and one foot in the boat, are going to fall into the river. -Tuscarora Proverb",
                "The weakness of the enemy makes our strength. -Cherokee Proverb",
                "A good soldier is a poor scout. -Cheyenne Proverb",
                "Poverty is a noose that strangles humility and breeds disrespect for God and man. -Sioux Proverb",
                "We will be known forever by the tracks we leave. -Dakota Proverb",
                "Do not judge your neighbor until you walk two moons in his moccasins. -Cheyenne Proverb",
                "Our first teacher is our own heart. -Cheyenne Proverb",
                "Everyone who is successful must have dreamed of something. -Maricopa Proverb",
                "All who have died are equal -Comanche Proverb",
                "One rain does not make a crop. -Creole Proverb",
                "You already possess everything necessary to become great. -Crow Proverb",
                "Life is not separate from death. It only looks that way. -Blackfoot Proverb",
                "You can't wake a person who is pretending to be asleep. -Navajo Proverb",
                "It is less of a problem to be poor, than to be dishonest. -Anishinabe Proverb",
                "Beware of the man who does not talk, and the dog that does not bark. -Cheyenne Proverb",
                "Even a small mouse has anger. -Native American Proverb",
                "Treat the earth well: it was not given to you by your parents, it was loaned to you by your children. We do not inherit the Earth from our Ancestors, we borrow it " +
                        "from our Children. -Native American Proverb",
                "A brave man dies but once, a coward many times. -Native American Proverb",
                "A man or woman with many children has many homes. -Lakota Sioux Proverb",
                "A good chief gives, he does not take. -Mohawk Proverb",
                "It is easy to be brave from a distance. -Omaha Proverb",
                "Do not wrong or hate your neighbor for it is not he that you wrong but yourself. -Pima Proverb",
                "Make my enemy brave and strong, so that if defeated, I will not be ashamed. -Plains Proverb",
                "A rocky vineyard does not need a prayer, but a pick ax. -Navajo Proverb",
                "It is no longer good enough to cry peace, we must act peace, live peace and live in peace. -Shenandoah Proverb",
                "We are made from Mother Earth and we go back to Mother Earth. -Shenandoah Proverb",
                "With all things and in all things, we are relatives. -Sioux Proverb",
                "The one who tells the stories rules the world. -Hopi Proverb",
                "The frog does not drink up the pond in which he lives. -Sioux Proverb",
                "The moon is not shamed by the barking of dogs. -Southwest Proverb",
                "Don't let yesterday use up too much of today. -Cherokee Proverb",
                "No river can return to its source, yet all rivers must have a beginning. -Native American Proverb",
                "Listen, or your tongue will make you deaf. -Native American Proverb",
                "Man has responsibility, not power. -Tuscarora Proverb",
                "The obstacle is the path. -Zen Proverb",
                "The rain falls on the just and the unjust. -Hopi Proverb",
                "Each bird loves to hear himself sing. -Arapaho Proverb",
                "When you die, you will be spoken of as those in the sky, like the stars. -Yurok Proverb"
        };

        public String[] sQuotes = new String[] {
            "18 holes is all I need, all day every day! -Tiger Woods",
            "We didn't lose the game; we just ran out of time. -Vince Lombardi",
            "The only way to prove that you’re a good sport is to lose. –Ernie Banks",
            "Only he who can see the invisible can do the impossible. –Frank L. Gaines",
            "When you’re riding, only the race in which you’re riding is important. –Bill Shoemaker",
            "Age is no barrier. It’s a limitation you put on your mind. –Jackie Joyner-Kersee",
            "I always felt that my greatest asset was not my physical ability, it was my mental ability. –Bruce Jenner",
            "A trophy carries dust. Memories last forever. –Mary Lou Retton",
            "Number one is just to gain a passion for running. To love the morning, to love the trail, to love the pace on the track. And if some kid gets really good at it, that’s cool too. –Pat Tyson",
            "Most people give up just when they’re about to achieve success. They quit on the one yard line. They give up at the last minute of the game one foot from a winning touchdown. –Ross Perot",
            "You have to do something in your life that is honorable and not cowardly if you are to live in peace with yourself. –Larry Brown",
            "There may be people that have more talent than you, but theres no excuse for anyone to work harder than you do. –Derek Jeter",
            "Baseball is the only field of endeavor where a man can succeed three times out of ten and be considered a good performer. –Ted Williams",
            "One man practicing sportsmanship is far better than 50 preaching it. –Knute Rockne",
            "The five S’s of sports training are: stamina, speed, strength, skill, and spirit; but the greatest of these is spirit. –Ken Doherty",
            "An athlete cannot run with money in his pockets. He must run with hope in his heart and dreams in his head. –Emil Zatopek",
            "Somewhere behind the athlete you’ve become and the hours of practice and the coaches who have pushed you is a little girl who fell in love with the game and never looked back…" +
                    " play for her. –Mia Hamm",
                "Winning isn't everything, but wanting to win is. -Vince Lombardi",
                "There are no gains without pains. -Adlai Stevenson",
                "To win without risk is to triumph without glory. -Corneille",
                "It isn't hard to be good from time to time in sports. What's tough is being good every day. -Willie Mays",
                "You are never a loser until you quit trying. -Mike Ditka",
                "If you can't accept losing, you can't win. -Vince Lombardi",

                "When you’ve got something to prove, there’s nothing greater than a challenge. –Terry Bradshaw",
            "Never give up, never give in, and when the upper hand is ours, may we have the ability to handle the win with the dignity that we absorbed the loss. –Doug Williams",
            "It’s not the will to win that matters—everyone has that. It’s the will to prepare to win that matters. –Paul 'Bear' Bryant",
            "Persistence can change failure into extraordinary achievement. –Marv Levy",
            "I’ve learned that something constructive comes from every defeat. –Tom Landry",
            "Make sure your worst enemy doesn’t live between your own two ears. –Laird Hamilton",
            "Set your goals high, and don’t stop till you get there. –Bo Jackson",
            "I became a good pitcher when I stopped trying to make them miss the ball and started trying to make them hit it. –Sandy Koufax",
            "If you can’t outplay them, outwork them. –Ben Hogan",
            "People ask me what I do in winter when there’s no baseball. I’ll tell you what I do. I stare out the window and wait for spring. –Rogers Hornsby",
            "Most people never run far enough on their first wind to find out they’ve got a second. –William James",
            "Do you know what my favorite part of the game is? The opportunity to play. –Mike Singletary",
            "If at first you don’t succeed, you are running about average. –M.H. Alderson",
            "Continuous effort — not strength or intelligence — is the key to unlocking our potential. –Liane Cardes",
            "Good is not good when better is expected. —Vin Scully",
            "The difference between the impossible and the possible lies in a person’s determination. –Tommy Lasorda",
            "Champions keep playing until they get it right. –Billie Jean King",
            "You were born to be a player. You were meant to be here. This moment is yours. –Herb Brooks",
            "What you lack in talent can be made up with desire, hustle, and giving 110 percent all the time.  –Don Zimmer",
            "If you fail to prepare, you’re prepared to fail. –Mark Spitz",
            "How you respond to the challenge in the second half will determine what you become after the game, whether you are a winner or a loser. –Lou Holtz",
            "Persistence can change failure into extraordinary achievement. –Matt Biondi",
            "Sports serve society by providing vivid examples of excellence. –George F. Will",
            "The principle is competing against yourself. It’s about self-improvement, about being better than you were the day before. –Steve Young",
            "The road to Easy Street goes through the sewer. –John Madden",
            "You are never really playing an opponent. You are playing yourself, your own highest standards, and when you reach your limits, that is real joy. –Arthur Ashe",
            "What makes something special is not just what you have to gain, but what you feel there is to lose. –Andre Agassi",
            "The more difficult the victory, the greater the happiness in winning. –Pele",
            "One man can be a crucial ingredient on a team, but one man cannot make a team. –Kareem Abdul-Jabbar",
            "Nobody who ever gave his best regretted it. –George Halas",
            "Stubbornness usually is considered a negative; but I think that trait has been a positive for me. –Cal Ripken Jr.",
            "You’ve got to take the initiative and play your game. In a decisive set, confidence is the difference. –Chris Evert",
            "When you win, say nothing, when you lose, say less. –Paul Brown",
            "The hardest skill to acquire in this sport is the one where you compete all out, give it all you have, and you are still getting beat no matter what you do. When you have " +
                    "the killer instinct to fight through that, it is very special. –Eddie Reese",
            "The mind is the limit. As long as the mind can envision the fact that you can do something, you can do it, as long as you really believe 100 percent. –Arnold Schwarzenegger",
            "When I go out there, I have no pity on my brother. I am out there to win. –Joe Frazier",
            "During my 18 years I came to bat almost 10,000 times. I struck out about 1,700 times and walked maybe 1,800 times. You figure a ballplayer will average about 500 at bats a season. That means I played seven years without ever hitting the ball. –Mickey Mantle",
            "I never left the field saying I could have done more to get ready and that gives me piece of mind. –Peyton Manning",
            "Leadership, like coaching, is fighting for the hearts and souls of men and getting them to believe in you. –Eddie Robinson",
            "You win some, you lose some, and some get rained out, but you gotta suit up for them all. –J. Askenberg",
            "Always make a total effort, even when the odds are against you. –Arnold Palmer",
            "Most talented players don’t always succeed. Some don’t even make the team. It’s more what’s inside. –Brett Favre",
            "You have to expect things of yourself before you can do them. –Michael Jordan",
            "To uncover your true potential you must first find your own limits and then you have to have the courage to blow past them. –Picabo Street",
            "Show me a guy who’s afraid to look bad, and I’ll show you a guy you can beat every time. –Lou Brock",
            "You can motivate by fear, and you can motivate by reward. But both those methods are only temporary. The only lasting thing is self motivation. –Homer Rice",
            "You find that you have peace of mind and can enjoy yourself, get more sleep, and rest when you know that it was a one hundred percent effort that you gave–win or lose. –Gordie Howe",
            "My motto was always to keep swinging. Whether I was in a slump or feeling badly or having trouble off the field, the only thing to do was keep swinging. –Hank Aaron",
            "I didn’t believe in team motivation. I believe in getting a team prepared so it knows it will have the necessary confidence when it steps on the field and be prepared to play a good game. –Tom Landry",
            "If you train hard, you’ll not only be hard, you’ll be hard to beat. –Herschel Walker",
            "Your biggest opponent isn’t the other guy. It’s human nature. –Bobby Knight",
            "If you can believe it, the mind can achieve it. –Ronnie Lott",
            "Without self-discipline, success is impossible, period. –Lou Holtz",
            "If you don’t have confidence, you’ll always find a way not to win. –Carl Lewis",
            "Obstacles don’t have to stop you. If you run into a wall, don’t turn around and give up. Figure out how to climb it, go through it, or work around it. –Michael Jordan",
            "Make each day your masterpiece. –John Wooden",
            "Excellence is the gradual result of always striving to do better. –Pat Riley",
            "Win If You Can, Lose If You Must, But NEVER QUIT! –Cameron Trammell",
            "Do you know what my favorite part of the game is? The opportunity to play. –Mike Singletary",
            "If you have everything under control, you’re not moving fast enough. –Mario Andretti",
            "Just keep going. Everybody gets better if they keep at it. –Ted Williams",
            "What do do with a mistake: recognize it, admit it, learn from it, forget it. –Dean Smith",
            "Push yourself again and again. Don’t give an inch until the final buzzer sounds. –Larry Bird",
            "If you aren’t going all the way, why go at all? –Joe Namath",
            "You can’t put a limit on anything. The more you dream, the farther you get. –Michael Phelps",
            "Do not let what you can not do interfere with what you can do. –John Wooden",
            "Pain is temporary. It may last a minute, or an hour, or a day, or a year, but eventually it will subside and something else will take its place. If I quit, however, it lasts forever. –Lance Armstrong",
            "Wisdom is always an overmatch for strength. –Phil Jackson",
            "The will to win is important, but the will to prepare is vital. –Joe Paterno",
            "Adversity cause some men to break; others to break records. –William A. Ward",
            "Never let your head hang down. Never give up and sit down and grieve. Find another way. –Satchel Paige",
            "Some people say I have attitude – maybe I do…but I think you have to. You have to believe in yourself when no one else does – that makes you a winner right there. –Venus Williams",
            "Never let the fear of striking out get in your way. –Babe Ruth",
            "It is not the size of a man but the size of his heart that matters. –Evander Holyfield",
            "I hated every minute of training, but I said, ‘Don’t quit. Suffer now and live the rest of your life as a champion.' –Muhammad Ali",
            "There are only two options regarding commitment. You’re either IN or you’re OUT. There is no such thing as life in-between. –Pat Riley",
            "A champion is someone who gets up when he can’t. –Jack Dempsey",
            "It ain’t over till it’s over. –Yogi Berra",
            "You’re never a loser until you quit trying. –Mike Ditka",
            "Never give up! Failure and rejection are only the first step to succeeding. –Jim Valvano",
            "You miss 100 percent of the shots you don’t take. –Wayne Gretzky",
            "The highest compliment that you can pay me is to say that I work hard every day, that I never dog it. –Wayne Gretzky",
            "Gold medals aren’t really made of gold. They’re made of sweat, determination, and a hard-to-find alloy called guts. –Dan Gable",
            "I’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. 26 times, I’ve been trusted to take the game winning shot and missed. I’ve failed over and over and over again in my life. And that is why I succeed. –Michael Jordan",
            "It’s not whether you get knocked down; it’s whether you get up. –Vince Lombardi",
            "The best motivation always comes from within -Michael Johnson" ,
            "Champions aren't made in the gyms. Champions are made from something they have deep inside them -- a desire, a dream, a vision. -Muhammad Ali",
            "True disputants are like true sportsmen: their whole delight is in the pursuit. -Alexander Pope",
            "Money was never a big motivation for me, except as a way to keep score. The real excitement is playing the game. -Donald Trump",
            "To succeed…You need to find something to hold on to, something to motivate you, something to inspire you. -Tony Dorsett",
            "It isn't the mountains ahead to climb that wear you out; it's the pebble in your shoe. -Muhammad Ali",
            "Difficulties in life are intended to make us better, not bitter. -Dan Reeves",
            "If you can’t accept losing, you can’t win. -Vince Lombardi",
            "Adversity causes some men to break; others to break records. -William A. Ward",
            "Relax? How can anybody relax and play golf? You have to grip the club, don't you? -Ben Hogan",
            "Concentration is a fine antidote to anxiety. -Jack Nicklaus",
            "The secret of winning football games is working more as a team, less as individuals. I play not my 11 best, but my best 11. -Knute Rockne",
            "A team is where a boy can prove his courage on his own. A gang is where a coward goes to hide. -Mickey Mantle",
            "The difference between the old ballplayer and the new ballplayer is the jersey. The old ballplayer cared about the name on the front. The new ballplayer cares about the name on the back." +
                    "- Steve Garvey",
            "You don't play against opponents, you play against the game of basketball. -Bobby Knight",
            "The rewards are going to come, but my happiness is just loving the sport and having fun performing. -Jackie Joyner Kersee",
            "A life of frustration is inevitable for any coach whose main enjoyment is winning. -Chuck Noll",
            "As you walk down the fairway of life you must smell the roses, for you only get to play one round. -Ben Hogan",
            "Do you know what my favorite part of the game is? The opportunity to play. -Mike Singletary",
            "It's a round ball and a round bat, and you got to hit it square. -Pete Rose",
            "Don't tell me how rocky the sea is, just bring the ship in. - Lou Holtz",
            "God gets you to the plate, but once you're there you're on your own. -Ted Williams",
            "In baseball and in business, there are three types of people. Those who make it happen, those who watch it happen, and those who wonder what happened. -Tommy Lasorda",
            "Slump? I ain’t in no slump. I just ain’t hittin. -Yogi Berra",
            "What other people may find in poetry or art museums, I find in the flight of a good drive. -Arnold Palmer",
            "Wisdom is always an overmatch for strength. -Phil Jackson",
            "A good hockey player plays where the puck is. A great hockey player plays where the puck is going to be. -Wayne Gretzky",
            "I never criticize a player until they are first convinced of my unconditional confidence in their abilities. -John Robinson",
            "You owe it to yourself to be the best you can possibly be – in baseball and in life. -Pete Rose",
            "Nothing will work unless you do. -John Wooden",
            "Good, better, best. Never let it rest. Until your good is better and your better is best. -Tim Duncan",
            "When I step onto the court, I don't have to think about anything. If I have a problem off the court, I find that after I play, my mind is clearer and I can come up with a better solution." +
                    " It's like therapy. It relaxes me and allows me to solve problems. -Michael Jordan",
            "I figure practice puts your brains in your muscles. -Sam Snead"
        };

        public String[] mQuotes = new String[] {
                "You were given this life because you are strong enough to live it. -Robin Sharma",
                "When you come to a fork in the road, take it -Yogi Berra",
                "Enjoy the little things, for one day you may look back and realize they were the big things. —Robert Brault",
                "Be ready when opportunity comes.... Luck is when preparation and opportunity meet. —Roy D. Chapin Jr.",
                "Sooner or later, those who win are those who think they can. —Richard Bach",
                "One important key to success is self-confidence. An important key to self-confidence is preparation. —Arthur Ashe",
                "What a wonderful life I've had! I only wish I'd realized it sooner. —Colette",
                "Acknowledging the good that you already have in your life is the foundation for all abundance. —Eckhart Tolle",
                "What you get by achieving your goals is not as important as what you become by achieving your goals. —Zig Ziglar",
                "Let us rise up and be thankful, for Gratitude is not only the greatest of virtues, but the parent of all the others. —Cicero",
                "The height of your accomplishments is determined by the depth of your convictions. —William F. Scolavino",
                "There are three kinds of people: those who let it happen, those who make it happen, and those who wonder what happened. " +
                        "—John Richardson",
                "It is not in everyone's power to secure wealth, office, or honors; but everyone may be good, generous, and wise. —Luc De Clapiers",
                "If you're never scared or embarrassed or hurt, it means you never take any chances. —Julia Sore",
                "Being defeated is often only a temporary condition. Giving up is what makes it permanent. —Marilyn vos Savan",
                "Some people say I have attitude - maybe I do. But I think you have to. You have to believe in yourself when no one else does -" +
                        " that makes you a winner right there. —Venus Williams",
                "The tragedy of life doesn't lie in not reaching your goal. The tragedy lies in having no goal to reach. —Benjamin E. Mayes",
                "View money and things not as something you create to fill a lack, but as tools to help you more fully express yourself and " +
                        "realize your potential. —Sanaya Roman and Duane Packer",
                "Abilities wither under faultfinding, blossom with encouragement. —Donald A. Laird",
                "We have to do the best we can. This is our sacred human responsibility. —Albert Einstein",
                "When we feel stuck, going nowhere - even starting to slip backward - we may actually be backing up to get a running start. —Dan Millman",
                "What is opportunity, and when does it knock? It never knocks. You can wait a whole lifetime, listening, hoping, and you will hear " +
                        "no knocking. None at all. You are opportunity, and you must knock on the door leading to your destiny. —Maxwell Maltz",
                "Learn to expect, not to doubt. In so doing, you bring everything into the realm of possibility. —Dr. Norman Vincent Peale",
                "Go out looking for one thing, and that's all you'll ever find. —Robert Flaherty",
                "Money is neither my god nor my devil. It is a form of energy that tends to make us more of who we already are, whether it's " +
                        "greedy or loving. —Dan Millman",
                "Dream big and dare to fail. -Norman Vaughan",
                "We become what we think about. -Earl Nightingale",
                "Ever tried. Ever failed. No matter. Try again. Fail again. Fail better. -Samuel Beckett",
                "Hope is in the heartbeat of the soul. -Michelle Horst",
                "You get what you settle for -Anonymous",
                "To be the best, you must be able to handle the worst. -Wilson Kanadi",
                "An investment in knowledge pays the best dividends. —Benjamin Franklin",
                "A wise man should have money in his head, but not in his heart. —Jonathan Swift",
                "Integrity is the essence of everything successful. —R. Buckminster Fuller",
                "Money - like health, love, happiness, and all forms of success that you want to create for yourself - is the result of " +
                        "living purposefully. It is not a goal unto itself. —Dr. Wayne ",
                "The gratification of wealth is not found in mere possession or in lavish expenditure, but in its wise application. —Miguel de Cervantes",
                "The real measure of your wealth is how much you'd be worth if you lost all your money. -Unknown",
                "Entrepreneurship is a state of mind, a can-do attitude, a capacity to focus on a vision and work toward it. —Barry Rogstad",
                "I believe life is a series of near misses. A lot of what we ascribe to luck is not luck at all. It's seizing the day and " +
                        "accepting responsibility for your future. It's seeing what other people don't see and pursuing that vision. —Howard Schultz",
                "Most powerful is he who has himself in his own power. —Seneca",
                "Winners are losers who got up and gave it one more try. —Dennis DeYoung",
                "Either you deal with what is the reality or you can be sure that the reality is going to deal with you. —Alex Haley",
                "Unless you try to do something beyond what you have already mastered, you will never grow. —Ralph Waldo Emerson",
                "The greater danger for most of us is not that our aim is too high and we miss it, but that it is too low and we reach it." +
                        " —Michelangelo Buonarroti",
                "Since we cannot change reality, let us change the eyes which see reality. -Nikos Kazantzakis",
                "Stories only happen to those that can tell them. -Patrick Rothfuss",
                "Life is not measured by its length, but by its depth. —Ralph Waldo Emerson",
                "The people who get on in this world are the people who get up and look for the circumstances they want and if they can't " +
                        "find them, they make them. —George Bernard Shaw",
                "There is one quality which one must possess to win, and that is definiteness of purpose, the knowledge of what one wants," +
                        " and a burning desire to possess it. —Napoleon Hill",
                "I can't change the direction of the wind, but I can adjust my sails to always reach my destination. —Jimmy Dean",
                "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be" +
                        " successful. —Herman Cain",
                "A pessimist is one who makes difficulties of opportunities. An optimist makes opportunities of so-called difficulties. -Unknown",
                "Ships are safe within the harbor, but is that what ships are for? -Anon",
                "Action is a great restorer and builder of confidence. Inaction is not only the result, but the cause, of fear. " +
                        "Perhaps the action you take will be successful; perhaps different action or adjustments will have to follow. But any " +
                        "action is better than no action at all. —Norman Vincent Peale",
                "Winners are the people who when the odds are stacked against them, and those around them have fallen, will have the courage " +
                        "to look within themselves and make the unbelieveable believeable, and the impossible possible. –C. Phillips",
                "When you follow your bliss doors will open where you would not have thought there would be doors; and where there wouldn't be" +
                        " a door for anyone else. —Joseph Campbell",
                "Let others lead small lives, but not you. Let others argue over small things, but not you. Let others cry over small " +
                        "hurts, but not you. Let others leave their future in someone else's hands, but not you. —Jim Rohn",
                "Persistent people begin their success where others end in failure. —Edward Eggleston",
                "Create a set of great personal values and surround yourself with the right people that can form your support system. " +
                        "Have an optimistic spirit and develop a strong purpose that you completely believe in and everything you can " +
                        "imagine is possible, for you. —Andrew Horton",
                "Things that are impossible just take longer. —Ian Hickson",
                "The darkest hour has only sixty minutes. —Morris Mandel",
                "All I would tell people is to hold onto what was individual about themselves, not to allow their ambition for success " +
                        "to cause them to try to imitate the success of others. You've got to find it on your own terms. —Harrison Ford",
                "Money like health, love, happiness, and all forms of success that you want to create for yourself is the result of living" +
                        " purposefully. It is not a goal unto itself. —Dr. Wayne ",
                "Good instincts usually tell you what to do long before your head has figured it out. —Michael Burke",
                "Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending. —Carl Bard",
                "It is good to dream, but it is better to dream and work. Faith is mighty, but action with faith is mightier. Desiring is " +
                        "helpful, but work and desire are invincible. —Thomas Robert Gaines",
                "When the bull's-eye becomes as big in your mind as an elephant, you are sure to hit it. —Alejandro Jodorowsky",
                "Optimism is the faith that leads to achievement. Nothing can be done without hope and confidence. —Helen Keller",
                "The minute you settle for less than you deserve, you get even less than you settled for. —Maureen Dowd",
                "Failure is the opportunity to begin again more intelligently. —Henry Ford",
                "Luck is what happens when preparation meets opportunity. —Lucius Annaeus Seneca ",

                "The two things I did learn were that you are as powerful and strong as you allow yourself to be, and that the " +
                        "most difficult part of any endeavor is taking the first step, making the first decision. —Robyn Davidson",
                "Whether you be man or woman, you will never do anything in this world without courage. It is the greatest quality of the " +
                        "mind next to honor. –James Lane Allen",
                "Optimism is essential to achievement and it is also the foundation of courage and true progress. –Nicholas Murray Butler",
                "If successful people have one common trait, it's an utter lack of cynicism. The world owes them nothing. They go out and " +
                        "find what they need without asking for permission; they're driven, talented, and work through negatives by focusing" +
                        " on the positives. —Mike Zimmerman",
                "It takes as much energy to wish as it does to plan. —Eleanor Roosevelt",
                "The wise man bridges the gap by laying out the path by means of which he can get from where he is to where he wants" +
                        " to go. —John Pierpont Morgan",
                "To accomplish great things, we must not only act, but also dream; not only plan, but also believe. —Anatole France",
                "If you have made mistakes there is always another chance for you... you may have a fresh start any moment you choose, for this" +
                        " thing we call failure is not the falling down, but the staying down. —Mary Pickford",
                "Apathy can be overcome by enthusiasm, and enthusiasm can be aroused by two things: first, an idea which takes the imagination " +
                        "by storm; and second, a definite, intelligible plan for carrying that idea into action. –Henry Miller",
                "Energy is the essence of life. Every day you decide how you're going to use it by knowing what you want and what it takes to" +
                        " reach that goal, and by maintaining focus. —Oprah Winfrey",
                "You can't help someone get up a hill without getting closer to the top yourself. —H. Norman Schwarzkopf",
                "Knowing is not enough; we must apply. Willing is not enough; we must do. —Johann von Goethe",
                "You are your own most important resource for making your life work. Life rewards action. Until your knowledge, awareness, " +
                        "insights, and understandings are translated into action, they are of no value. —Phillip C. McGraw",
                "Be thankful for what you have; you'll end up having more. If you concentrate on what you don't have, you will never, ever " +
                        "have enough. —Oprah Winfrey",
                "You don't get in life what you want. You get what you are. —Les Brown",
                "Nothing is more endangered in the modern world than the powerful combination of hard work toward meaningful goals joined " +
                        "with an exuberant embrace of the present moment. —Tom Morris",
                "It is not the strongest of the species that survive, nor the most intelligent, but the one most responsive to change. —Charles Darwin",
                "All problems become smaller if you don't dodge them, but confront them. —-William F. Halsey",
                "Life is mostly froth and bubble. Two things stand like stone: kindness in another's trouble, courage in our own. —Adam Gordon",
                "That which does not kill you makes you stronger. —Neitzsche",
                "It's easy to be brave from a safe distance. —Aesop",
                "It's not because things are difficult that we do not dare; it's because we do not dare that they are difficult. —Seneca",
                "Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending. —Carl Bard",
                "Experience is that marvelous thing that enables you to recognize a mistake when you make it again. —F. P. Jones",
                "Only those who do nothing at all make no mistakes... but that would be a mistake. -Unknown",
                "Life is a leap into the unknown. If you want a guarantee, buy a toaster. —Bill Harris",
                "Be master of your petty annoyances and conserve your energies for the big, worthwhile things. It isn't the mountain " +
                        "ahead that wears you out - it's the grain of sand in your shoe. —Robert Service",
                "Destiny is as destiny does. If you believe you have no control, then you have no control. —Wess Roberts",
                "Let yourself be silently drawn by the stronger pull of what you really love. —Rumi",
                "Having a vision for your life allows you to live out of hope, rather than out of your fears. —Stedman Graham",
                "To understand the heart and mind of a person, look not at what he has already achieved, but at what he aspires o do." +
                        " —Kahlil Gibran",
                "I don't know what your destiny will be, but one thing I know: the only ones among you who will be truly happy are those" +
                        " who have sought and found how to serve. —Albert Schweitzer",
                "If you want to know the past, to know what has caused you, look at yourself in the PRESENT, for that is the past's effect." +
                        " If you want to know your future, then look at yourself in the PRESENT, for that is the cause of the future." +
                        " —Majjhima Nikaya",
                "All of life is a near-death experience. —Alan Harris",
                "When you were born, you cried and the world rejoiced. Live your life so that when you die, the world cries and you rejoice. —Cherokee Expression",
                "There is a time to let things happen, and a time to make things happen. -Unknown",
                "Life is what happens when you are making other plans. —John Lennon",
                "Circumstance does not make the man. Circumstance reveals man to himself. —Emerson",
                "Time is too slow for those who wait, too swift for those who fear, too long for those who grieve, too short for those" +
                        " who rejoice, but for those who love, time is eternity. —Henry Van Dyke",
                "Truly loving another means letting go of all expectations. It means full acceptance, even celebration of another's" +
                        " personhood. —Karen Casey",
                "It is not how much we do, but how much love we put in the doing. It is not how much we give, but how much love we" +
                        " put in the giving. —Mother Teresa",
                "People take different roads seeking fulfillment and happiness. Just because they're not on your road doesn't mean " +
                        "they've gotten lost. —Dalai Lama",
                "We look forward to the time when the Power of Love will replace the Love of Power. Then will our world know the " +
                        "blessings of Peace. –William E. Gladstone",
                "We don't stop playing because we grow old; we grow old because we stop playing. –George Bernard Shaw",
                "The purpose of life is not to fight against evil and misfortune; it is to unveil magnificence. –Alan Cohen",
                "A ship in harbor is safe, but that is not what ships are for. –John A. Shedd",
                "Let others lead small lives, but not you. Let others argue over small things, but not you. Let others cry over" +
                        " small hurts, but not you. Let others leave their future in someone else's hands, but not you. —Jim Rohn",
                "Trust yourself, then you will know how to live. —Johann Wolfgang van Goethe",
                "You can never cross the ocean unless you have the courage to lose sight of the shore. —Christopher Columbus",
                "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not " +
                        "see the one that has opened for us. —Helen Keller",
                "Always do right. This will gratify some people and astonish the rest. —Mark Twain",
                "It is our choices that show what we truly are, far more than our abilities. —J.K. Rowling",
                "Whatever you are willing to put up with is exactly what you will have. —Anonymous",
                "We are what we imagine. Our very existence consists in our imagination of ourselves.," +
                        "The greatest tragedy that can befall us is to go unimagined. —N. Scott Momaday",
                "There is a fire inside. Sit down beside it. Watch the flames, the ancient, flickering dance of yourself. —John MacEnulty",
                "Destiny is not a matter of chance, it is a matter of choice. It is not a thing to be waited for, it is a thing" +
                        " to be achieved. —William Jennings Bryan",
                "I have always known that at last I would take this road, but yesterday I did not know that it would be today. —Japanese Haiku",
                "There is no chance, no destiny, no fate that can circumvent or hinder or control the firm resolve of" +
                        " a determined soul. —Ella Wheeler Wilcox",
                "Life is not discovery of fate; it is continuous creation of future, through choices of thoughts," +
                        " feelings and actions in the present. —Sanjay Sahay",
                "You were born an original. Don't die a copy. —John Mason",
                "Is life not a hundred times too short for us to stifle ourselves? —Friedrich Nietzsche",
                "There is only one real failure in life that is possible, and that is not to be true to the best one knows. —John Farrar",
                "The pen that writes your life story must be held in your own hand. —Irene C. Kassorla",
                "Every choice before you represents the universe inviting you to remember who you are and what you want. —Alan Cohen",
                "Men weary as much of not doing the things they want to do as of doing the things they do not want to do. —Eric Hoffer",
                "Out of clutter, find simplicity. From discord, find harmony. In the middle of difficulty lies opportunity. —Albert Einstein",
                "Nothing truly valuable arises from ambition or from a mere sense of duty; it stems rather from love and devotion" +
                        " towards men and towards objective things. —Albert Einstein",
                "To serve is beautiful, but only if it is done with joy and a whole heart. —Pearl S. Buck",
                "Whatever you are, be a good one. -Abraham Lincoln",
                "Follow your bliss. -Joseph Campbell",
                "Life is trying things to see if they work. -Ray Bradbury",
                "How do we keep our inner fire alive? Two things, at minimum, are needed: an ability to appreciate the positives" +
                        " in our life - and a commitment to action. —Nathaniel Branden",
                "Let him who would enjoy a good future waste none of his present. —Roger Babson",
                "The path to our destination is not always a straight one. We go down the wrong road, we get lost," +
                        " we turn back. Maybe it doesn't matter which road we embark on. Maybe what matters is that we embark. —Barbara Hall",
                "It takes great courage to faithfully follow what we know to be true. —Sara E. Anderson",
                "Our background and circumstances may have influenced who we are, but we are responsible for who we become. —Barbara Geraci",
                "Great thoughts speak only to the thoughtful mind, but great actions speak to all Mankind. —Emily P. Bissell",
                "There is a criterion by which you can judge whether the thoughts you are thinking and the things you are doing" +
                        " are right for you. The criterion is: Have they brought you inner peace? —The Peace Pilgrim",
                "There is more in us than we know. If we can be made to see it, perhaps, for the rest of our lives, we will be " +
                        "unwilling to settle for less. —Kurt Hahn",
                "From long familiarity, we know what honor is. It is what enables the individual to do right in the face of" +
                        " complacency and cowardice. It is what enables the soldier to die alone, the political prisoner to" +
                        " resist, the singer to sing her song, hardly appreciated, on a side street. —Mark Helprin",
                "We all live under the same sky, but we don't all have the same horizon. —Konrad Adenauer",
                "If it doesn't feel right, don't do it. That is the lesson, and that lesson alone will save you a lot of grief. —Oprah Winfrey",
                "The time is always right to do what is right. —Martin Luther King, Jr.",
                "Time is the coin of your life. It is the only coin you have, and only you can determine how it will be spent. " +
                        "Be careful lest you let other people spend it for you. —Carl Sandburg",
                "The goal of childhood is to become an individual; the goal of adulthood is to give that individuality away. The" +
                        " task of childhood is to separate; the task of adulthood is to connect. —James W. Jones",
                "The best career advice to give the young is, find out what you like doing best and get someone else to " +
                        "pay you for doing it. —Katherine Whilehaen",
                "The gem cannot be polished without friction nor man without trials. —Confucius",
                "Hands that serve are holier than lips that pray. —Sai Baba",
                "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. —Ralph Waldo Emerson",
                "You will recognize your own path when you come upon it, because you will suddenly have all the energy and imagination you " +
                        "will ever need. —Jerry Gillies",
                "Destiny is not a matter of chance, it is a matter of choice. It is not a thing to be waited for, it is a " +
                        "thing to be achieved. —Jeremy Kitson",
                "The best way to find yourself is to lose yourself in the service of others. —Mohandas K. Gandhi",
                "The height of your accomplishments will equal the depth of your convictions. —William F. Scolavino",
                "I think the purpose of life is to be useful, to be responsible, to be honorable, to be compassionate. It is," +
                        " after all, to matter: to count, to stand for something, to have made some difference that you lived at all. —Leo C. Rosten",
                "Toil and risk are the price of glory, but it is a lovely thing to live with courage and die leaving an everlasting " +
                        "fame. —Alexander the Great",
                "To give real service you must add something which cannot be bought or measured with money, and that is sincerity" +
                        " and integrity. —Donald A. Adams",
                "Dignity and respect has to do with ... your personal power to make a difference by being true to the best within you" +
                        " and letting that truth shine through your words and actions. —Gail Pursell Elliott",
                "You will recognize your own path when you come upon it, because you will suddenly have all the energy and imagination" +
                        " you will ever need. —Jerry Gillies",
                "Seek out that particular mental attribute which makes you feel most deeply and vitally alive, along with which " +
                        "comes the inner voice which says, 'This is the real me,' and when you have found that attitude, follow it. —William James",
                "When you see what you're here for, the world begins to mirror your purpose in a magical way. It's almost as if " +
                        "you suddenly find yourself on a stage in a play that was written expressly for you. —Betty Sue Flowers",
                "We seek purpose when we are not in touch with who we really are. When an apple tree discovers who it is, the " +
                        "question 'what must I do?' disappears. When you discover who you are (at the deepest place of your being)" +
                        " you will find your purpose. —Colleen-Joy Page",
                "Your time is limited, so don't waste it living someone else's life and don't let the noise of others' opinions" +
                        " drown out your own inner voice. Most important, have the courage to follow your heart and intuition." +
                        " They somehow already know what you truly want to become. —Steve Jobs",
                "Too many people overvalue what they are not and undervalue what they are. —Malcolm Forbes",
                "True happiness is not attained through self-gratification, but through fidelity to a worthy purpose. –Helen Keller",
                "We seek purpose when we are not in touch with who we really are. When an apple tree discovers who it is, the question " +
                        "what must I do?' disappears. When you discover who you are (at the deepest place of your being) you will" +
                        " find your purpose. —Colleen-Joy Page",
                "People who consider themselves victims of their circumstances will always remain victims unless they develop a " +
                        "greater vision for their lives. —Stedman Graham",
                "Too many of us are not living our dreams because we are living our fears. —Les Brown",
                "I want to sing like the birds sing, not worrying about who hears or what they think. —Rumi",
                "Love without action is meaningless and action without love is irrelevant. —Deepak Chopra",
                "You often meet your destiny on the road you've taken to avoid it. -Unknown",
                "Every positive change, every jump to a higher level of energy and awareness, involves a rite of passage. Each time to" +
                        " ascend to a higher rung on the ladder of personal evolution, we must go through a period of discomfort, of initiation." +
                        " I have never found an exception. —Dan Millman",
                "There is a vitality, a life force, an energy that is translated through you; and because there is only one of you in all" +
                        " of time, this expression is unique. —Martha Graham",
                "Your vision will become clear only when you can look into your own heart. Who looks outside, dreams, who looks inside awakes." +
                        " —Carl Gustav Jung",
                "Wisdom is knowing what path to take next... Integrity is taking it. -Unknown",
                "We can't change the wind, but we can adjust the sails. -Unknown",
                "If you don't design your own life plan, chances are you'll fall into someone else's plan. And " +
                        "guess what they have planned for you? Not much. —Jim Rohn",
                "Destiny is not a matter of chance, it is a matter of choice. It is not a thing to be waited for, " +
                        "it is a thing to be achieved. —William Jennings Bryan",
                "The meaning of life is to give life meaning. —Ken Hudgins",
                "Everyone has a purpose in life... a unique gift or special talent to give to others. And when we blend this " +
                        "unique talent with service to others, we experience the ecstasy and exultation of our own spirit, which" +
                        " is the ultimate goal of all goals. —Deepak Chopra",
                "Though no one can go back and make a brand new start, anyone can start from now and make a brand new ending. —Carl Bard",
                "It's never too late to be what you might have been. —George Elliot",
                "Life's like a movie; write your own ending, keep believing, keep pretending... —Jim Henson",
                "Life has meaning only if you do what is meaningful to you. —Alan Cohen",
                "Destiny is not a matter of chance, it is a matter of choice. It is not a thing to be waited for, it is a thing " +
                        "to be achieved. —Jeremy Kitson",
                "Life is a daring adventure or it is nothing at all. —Helen Keller",
                "There is no security in this life. There is only opportunity. —Douglas MacArthur",
                "It may be that when we no longer know what to do, we have come to our real work, and when we no longer know which way to go," +
                        " we have begun our real journey. —Wendell Berry",
                "Don't ask yourself what the world needs; ask yourself what makes you come alive. And then go and do that. Because what" +
                        " the world needs is people who have come alive. —Harold Whitman",
                "The only limits to the possibilities in your life tomorrow are the buts you use today. —Les Brown",
                "When you are inspired by some great purpose, some extraordinary project, all your thoughts break their bounds. Dormant" +
                        " forces, faculties and talents become alive, and you discover yourself to be a greater person by far than you ever " +
                        "dreamed yourself to be. —Pantanjali",
                "Live what you love. -Jo Deurbrouck",
                "Strange is our situation here upon earth. Each of us comes for a short visit, not knowing why, yet sometimes seeming " +
                        "to divine a purpose. From the standpoint of daily life, however, there is one thing we do know - that man is here" +
                        " for the sake of other men. —Albert Einstein",
                "Man is not a being who stands still, he is a being in the process of becoming. The more he enables himself to become, " +
                        "the more he fulfills his true mission. —Rudolph Steiner",
                "The person without a purpose is like a ship without a rudder. —Thomas Carlyle",
                "Your vision will become clear only when you look into your heart. Who looks outside, dreams. Who looks inside, awakens. —Carl Jung",
                "I think the purpose of life is to be useful, to be responsible, to be honorable, to be compassionate. It is, " +
                        "after all, to matter: to count, to stand for something, to have made some difference that you lived at all. —Leo C. Rosten",
                "He who waits to do a great deal of good at once, will never do anything. —Samuel Johnson",
                "You must be the change you wish to see in the world. —Mahatma Ghandi",
                "A man is ethical only when life, as such, is sacred to him, that of plants and animals as that of his fellow men," +
                        " and when he devotes himself helpfully to all life that is in need of help. —George Orwell",
                "It is never too late to become what you might have been. —George Elliot",
                "Life isn't about finding yourself. Life is about creating yourself. —George Bernard Shaw",
                "A good traveler has no fixed plans, and is not intent on arriving. —Lao Tzu",
                "He who dares nothing need hope for nothing. -Unknown",
                "Far better is it to dare mighty things, to win glorious triumphs - even though checkered by failure - than to rank " +
                        "with those poor spirits who neither enjoy much nor suffer much, because they live in a gray twilight that " +
                        "knows not victory nor defeat. —Theodore Roosevelt",
                "A coward gets scared and quits. A hero gets scared, but still goes on. -Unknown",
                "People often say that motivation doesn’t last. Well, neither does bathing, that’s why we recommend it daily. -Zig Ziglar",
                "If you can't fly then run, if you can't run then walk, if you can't walk then crawl, but whatever you do you have " +
                        "to keep moving forward. - Martin Luther King, Jr. ",
                "Chase the vision, not the money, the money will end up following you. -Tony Hsieh",
                "You don’t learn to walk by following rules. You learn by doing and falling over. -Richard Branson",
                "Your most unhappy customers are your greatest source of learning. -Bill Gates",
                "Being happy does not always need a reason. Just be happy. -Prince Willis",
                "Whenever you do a thing, act as if all the world were watching. -Thomas Jefferson",
                "We cannot truly face life until we face the fact that it will be taken away from us. -Billy Graham",
                "Life's like a boom-a-rang. The more good you throw out, the more you receive in return. -Josh S. Hinds",
                "Life's like a box of chocolates, you never know which one you'll get -Forest Gump",
                "A hero is no braver than an ordinary man, but braver five minutes longer. -Unknown",
                "The fear is worse than the pain. -Shannon Bahr",
                "What you do speaks so loudly that I cannot hear what you say -Ralph Waldo Emerson",
                "A free lunch is only found in mousetraps. -John Capuzzi",
                "All life is an experiment. -Ralph Waldo Emerson",
                "Nothing great was ever achieved without enthusiasm. -Ralph Waldo Emerson",
                "People only see what they are prepared to see. -Ralph Waldo Emerson",
                "Don't worry so much about what others think of you, they are not thinking of you that much! It's true -Unknown",
                "Why? Why Not? Why Not You? Why Not Now? -Aslan",
                "You must pay in the past to receive in the future. -Taylor Simpson",
                "Someone's opinion of you does not have to become your reality. -Les Brown",
                "The life given us by nature is short, but the memory of a life well spent is eternal. -Cicero",
                "The most wasted of all days is one without laughter. -E. E. Cummings",
                "We must all suffer one of two things: the pain of discipline or the pain of regret or disappointment. -Jim Rohn",
                "Life is too short to be small. -Benjamin Disraeli",
                "No winter lasts forever; no spring skips its turn. -Hal Borland",
                "Courage is not the absence of fear, but rather the judgment that something else is more important than fear. —Ambrose Redmoon",
                "It is your decisions not your conditions that truly shape the quality of your life. —Anthony Robbins",
                "Life is found in the dance between your deepest desire and your greatest fear. —Anthony Robbins",
                "The price of excellence is discipline; the cost of mediocrity is disappointment. —William Arthur Ward",
                "If we had no winter, the spring would not be so pleasant; if we did not sometimes taste of adversity, prosperity would not be so " +
                        "welcome. —Anne Bradstreet",
                "Sometimes our fate resembles a fruit tree in winter. Who would think that those branches would turn green again and blossom, but " +
                        "we hope it, we know it. —Johann Wolfgang von Goeth",
                "Even if you encounter opposition, have conviction and finish what you start. In the end, people will understand. —Kotaku Wamura",
                "My grandfather once told me that there were two kinds of people: those who do the work and those who take the credit. He told me" +
                        " to try to be in the first group; there was much less competition. —Indira Gandhi",
                "A moment of choice is a moment of truth. It's the testing point of our character and competence. —Stephen Covey",
                "If your ship doesn't come in, swim out to it! —Jonathan Winters",
                "If doubt is challenging you and you do not act, doubts will GROW. Challenge the doubts with action and YOU will grow. —John Kanary",
                "Those who turn good organizations into great organizations are motivated by a deep creative urge and an inner compulsion for sheer" +
                        " unadulterated excellence for its own sake. —Jim Collins",
                "Compromise: The art of dividing a cake in such a way that everybody believes he got the biggest piece. —Sherry Rothfield",
                "We cannot direct the wind but we can adjust the sails. —Anonymous",
                "Life's not about waiting for the storms to pass... it's about learning to dance in the rain. —B.J. Gallagher",
                "When you reach the end of your rope, tie a knot in it and hang on. —Thomas Jefferson",
                "Power is of two kinds. One is obtained by the fear of punishment and the other by acts of love. Power based on love" +
                        " is a thousand times more effective and permanent than the one derived from fear of punishment. —Mahatma Gandhi",
                "Great masters merit emulation, not worship. —Alan Cohen",
                "Clear, written goals have a wonderful effect on your thinking. They motivate you and galvanize you into action." +
                        " They stimulate your creativity, release your energy, and help you to overcome procrastination as much as any other factor. " +
                        "—Brian Tracy",
                "Planning is bringing the future into the present so that you can do something about it now. —Alan Lakein",
                "Confidence is contagious. So is the lack of confidence. —Vince Lombardi",
                "Optimism may sometimes be delusional, but pessimism is always delusional. —Alan Cohen",
                "Few things help an individual more than to place responsibility upon them and to let them know that you trust them. —Booker T. Washington",
                "We are continually faced with great opportunities which are brilliantly disguised as unsolvable problems. —Margaret Mead",
                "Long-range goals keep you from being frustrated by short-term failures. —James Cash Penney",
                "If you just set out to be liked, you would be prepared to compromise on anything at any time, and you would achieve nothing." +
                        " —Margaret Thatcher",
                "You may be disappointed if you fail, but you are doomed if you don't try. —Beverly Sills",
                "We can do anything we want to as long as we stick to it long enough. —Helen Keller",
                "In organizations, real power and energy is generated through relationships. The patterns of relationships and the capacities" +
                        " to form them are more important than tasks, functions, roles, and positions. —Margaret Wheatley",
                "It's not differences that divide us. It's our judgments about each other that do. —Margaret Wheatley",
                "You have within you right now, everything you need to deal with whatever the world can throw at you. —Brian Tracy",
                "There will come a time when you believe everything is finished. That will be the beginning. —Louis L'Amour",
                "It is understanding that gives us an ability to have peace. When we understand the other fellow's viewpoint, and he understands ours," +
                        " then we can sit down and work out our differences. —Harry S. Truman",
                "Nearly all men can stand adversity, but if you want to test a man's character, give him power. —Abraham Lincoln",
                "Freedom is actually a bigger game than power. Power is about what you can control. Freedom is about what you can unleash. —Harriet Rubin",
                "Destiny is not a matter of chance, it is a matter of choice; it is not a thing to be waited for, it is a thing to be achieved. " +
                        "—William Jennings Bryan",
                "The ultimate measure of man is not where he stands in moments of comfort and convenience, but where he stands at times of challenge" +
                        " and controversy. —Dr. Martin Luther King Jr.",
                "Management is doing things right; leadership is doing the right things. —Peter F. Drucker",
                "A leader is a dealer in hope. —Napoleon Bonaparte",
                "The very essence of leadership is that you have to have vision. You can't blow an uncertain trumpet. —Theodore M. Hesburgh",
                "The best executive is the one who has sense enough to pick good men to do what he wants done, and self-restraint to " +
                        "keep from meddling with them while they do it. —Theodore Roosevelt",
                "A leader is one who sees more than others see, who sees farther than others see, and who sees before others see. —Leroy Eimes",
                "The task of the leader is to get his people from where they are to where they have not been. —Henry Kissinger",
                "Great leaders are almost always great simplifiers, who can cut through argument, debate, and doubt to offer a" +
                        " solution everybody can understand. —General Colin Powell",
                "In periods where there is no leadership, society stands still. Progress occurs when courageous, skillful " +
                        "leaders seize the opportunity to change things for the better. —Harry Truman",
                "The leader is one who mobilizes others toward a goal shared by leader and followers. —Gary Wills",
                "Leadership is lifting a person's vision to higher sights, the raising of a person's performance to a higher " +
                        "standard, the building of a personality beyond its normal limitations. —Peter F. Drucker",
                "Leadership is getting people to work for you when they are not obligated. —Fred Smith",
                "My own definition of leadership is this: The capacity and the will to rally men and women to a common purpose " +
                        "and the character which inspires confidence. —General Montgomery",
                "Before you are a leader, success is all about growing yourself. When you become a leader, success is all " +
                        "about growing others. —Jack Welch",
                "The leader has to be practical and a realist, yet must talk the language of the visionary and the idealist. —Eric Hoffer",
                "Nearly all men can stand adversity, but if you want to test a man's character, give him power. —Abraham Lincoln",
                "Am I not destroying my enemies when I make friends of them? —Abraham Lincoln",
                "Anyone who has never made a mistake has never tried anything new. —Albert Einstein",
                "Any fool can criticize, condemn, and complain, and most fools do. —Benjamin Franklin",
                "Beware of little expenses. A small leak will sink a big ship. —Benjamin Franklin",
                "He that is of the opinion money will do everything may well be suspected of doing everything for money. —Benjamin Franklin",
                "First ask yourself: What is the worst that can happen? Then prepare to accept it. Then proceed to improve on the worst. —Dale Carnegie",
                "If you want to gather honey, don't kick over the beehive. —Dale Carnegie",
                "You can make more friends in two months by becoming interested in other people than you can in two years by trying to" +
                        " get other people interested in you. —Dale Carnegie",
                "Most of the important things in the world have been accomplished by people who have kept on trying when there seemed to" +
                        " be no hope at all. —Dale Carnegie",
                "An intellectual is a man who takes more words than necessary to tell more than he knows. —Dwight D. Eisenhower",
                "Farming looks mighty easy when your plow is a pencil and you're a thousand miles from the corn field. —Dwight D. Eisenhower",
                "To be prepared for war is one of the most effective means of preserving peace. —George Washington",
                "Few men have virtue to withstand the highest bidder. —George Washington",
                "If you once forfeit the confidence of your fellow citizens, you can never regain their respect and esteem. You may fool " +
                        "all of the people some of the time; you can even fool some of the people all the time; but you can't fool all of " +
                        "the people all of the time. —Abraham Lincoln",
                "Leadership is the art of getting someone else to do something you want done because he wants to do it. —Dwight D. Eisenhower",
                "You cannot shake hands with a clenched fist. —Golda Meir",
                "I can honestly say that I was never affected by the question of the success of an undertaking. If I felt it was the right" +
                        " thing to do, I was for it regardless of the possible outcome. —Golda Meir",
                "Failure is only the opportunity to begin again more intelligently. —Henry Ford",
                "Associate yourself with men of good quality if you esteem your own reputation, for 'tis better to be alone than in bad company." +
                        " —George Washington",
                "The price of greatness is responsibility. —Winston Churchill",
                "The greatest lesson in life is to know that even fools are right sometimes. —Winston Churchill",
                "It is a mistake to look too far ahead. Only one link in the chain of destiny can be handled at a time. —Winston Churchill",
                "If you want to get somewhere you have to know where you want to go and how to get there. Then never, never, never give up. " +
                        "—Norman Vincent Peale",
                "We must find time to stop and thank the people who have made a difference in our lives. —Dan Zadra",
                "To lead people, walk beside them... As for the best leaders, the people do not notice their existence. The next best," +
                        " the people honor and praise. The next, the people fear; and the next, the people hate. When the best leader's work is done " +
                        "the people say, 'We did it ourselves'. —Lao Tzu",
                "Conviction is worthless unless it is converted into conduct. —Thomas Carlye",
                "Courage is doing what you are afraid to do. There can be no courage without fear. —P. Hayes",
                "Entrepreneurship is a state of mind, a can-do attitude, a capacity to focus on a vision and work toward it. —Barry Rogstad",
                "Many of our fears are tissue paper thin, and a single courageous step would carry us clear through them. —Brendan Francis",
                "Nothing in life is to be feared. It is only to be understood. —Marie Curie",
                "If your actions inspire others to do more, to learn more, to dream more or to become more, you are a leader. —John Quincy Adams",
                "When we accept tough jobs as a challenge to our ability and wade into them with joy and enthusiasm, miracles can happen. —Arland Gilbert",
                "It takes as much energy to wish as it does to plan. —Eleanor Roosevelt",
                "The wise man bridges the gap by laying out the path by means of which he can get from where he is to where he wants to go." +
                        " —John Pierpont Morgan",
                "The question in life is not whether you get knocked down. You will. The question is, are you ready to get back up... and fight" +
                        " for what you believe in? —Dan Quayle",
                "Out of clutter, find simplicity. From discord, find harmony. In the middle of difficulty lies opportunity. —Albert Einstein",
                "You will never change your life until you change something you do daily. —Mike Murdock",
                "Real difficulties can be overcome. It's the imaginary ones that are unconquerable. —Theodore Vail",
                "Courage is not the absence of fear, but rather the judgement that something else is more important than fear. —Ambrose Redmoon",
                "Luck favors the well prepared. —Anonymous",
                "Only those who will risk going too far can possibly find out how far one can go. —T.S. Eliot",
                "If we can only accept what we currently believe, we have already reached our full potential. Be willing to experiment, to take risks. " +
                        "While skepticism can be healthy, too much skepticism can be deadly... deadly to one's spirit, to one's sense of well-being and to" +
                        " one's dreams. —Blair Warren",
                "People will do anything for those who encourage their dreams, justify their failures, allay their fears, confirm their suspicions and" +
                        " help them throw rocks at their enemies. —Blair Warren",
                "Your past is not your potential. In any hour you can choose to liberate the future. —Marilyn Ferguson",
                "Home is not where you live, but where they understand you. —Christian Morganstern",
                "Let everyone sweep in front of his own door, and the whole world will be clean. —Johann Wolfgang von Goethe",
                "Formal education will make you a living; self education will make you a fortune. —Jim Rohn",
                "Open your arms to change, but don't let go of your values. —Dalai Lama",
                "You must take personal responsibility. You cannot change the circumstances, the seasons, or the wind, but you can change yourself. —Jim Rohn",
                "I have never met a man so ignorant that I couldn't learn something from him. —Galileo Galilei",
                "It is your prime responsibility to acquire useful knowledge from others and to apply it appropriately. You don't have to reinvent the wheel, but you do have to learn from those who did. —Gary Ryan Blair",
                "It is more important to know where you are going than to get there quickly. —Mabel Newcomber",
                "Be who you are and say what you feel, because those who mind don't matter and those who matter don't mind. —Dr. Seuss",
                "It is good to dream, but it is better to dream and work. Faith is mighty, but action with faith is mightier. —Thomas Robert Gaines",
                "Never let your sense of morals get in the way of doing what's right. —Isaac Asimov",
                "The past cannot be changed. The future is yet in your power. —Hugh White",
                "If you don't stand for something, you'll fall for anything. —Martin Luther King",
                "When the facts change, I change my mind. What do you do, sir? —John Maynard Keynes",
                "If we don't believe in freedom of expression for people we despise, we don't believe in it at all. —Noam Chomsky",
                "Great minds discuss ideas. Average minds discuss events. Small minds discuss people. -Unknown",
                "Yesterday is the past. Tomorrow is the future. Today is a gift and that's why we call it the present. -Alice Morse Earle",
                "Once you do something you love, you never have to work again. —Willie Hill",
                "Success is getting what you want. Happiness is wanting what you get. -Dale Carnegie",
                "Life is a journey and if you fall in love with the journey you will be in love forever. —Peter Hagerty",
                "When you return to your old hometown, you find it wasn't the town you missed, but your childhood. —Earl Wilson",
                "As we grow old, the beauty steals inward. —Ralph Waldo Emerson",
                "Life begins as a quest of the child for the man, and ends as a journey by the man to rediscover the child. —Sam Ewing",
                "Ultimately your greatest teacher is to live with an open heart. —Pat Rodegast",
                "Doing what you like is freedom. Liking what you do is happiness. —Frank Tyger",
                "We forge the chains we wear in life. —Charles Dickens",
                "If you look to others for fulfillment, you will never be fulfilled. If your happiness depends on money, you will never be happy with" +
                        " yourself. Be content with what you have; rejoice in the way things are. When you realize there is nothing lacking, the world " +
                        "belongs to you. —Lao Tzu",
                "Everything is a gift of the universe—even joy, anger, jealously, frustration, or separateness. Everything is perfect either for our " +
                        "growth or our enjoyment. —Ken Keyes Jr.",
                "There is no such thing as a problem without a gift for you in its hands. You seek problems because you need their gifts. —Richard Bach",
                "If you want to be happy, set a goal that commands your thoughts, liberates your energy, and inspires your hopes. —Andrew Carnegie",
                "For me it is sufficient to have a corner by my hearth, a book and a friend, and a nap undisturbed by creditors or grief. —Fernandez de" +
                        " Andrada",
                "You cannot judge what should bring others joy, and others cannot judge what should bring you joy. —Alan Cohen",
                "The art of living lies less in eliminating our troubles than growing with them. —Bernard M. Baruch",
                "Be happy with what you have. Be excited about what you want. —Alan Cohen",
                "If you start to think the problem is 'out there,' stop yourself. That thought is the problem. —Stephen Covey",
                "Happiness cannot be traveled to, owned, earned, worn or consumed. Happiness is the spiritual experience of living every minute " +
                        "with love, grace, and gratitude. —Denis Waitley",
                "Happiness is not a station you arrive at, but a manner of traveling. —Margaret Lee Runbeck",
                "Happiness is the meaning and the purpose of life, the whole aim and end of human existence. —Aristotle",
                "Security is when everything is settled, when nothing can happen to you; security is the denial of life. —Germaine Greer",
                "Focus on the journey, not the destination. Joy is found not in finishing an activity but in doing it. —Greg Anderson",
                "Thousands of candles can be lit from a single candle, and the life of the candle will not be shortened. Happiness never decreases" +
                        " by being shared. —Buddha",
                "The best remedy for those who are afraid, lonely or unhappy is to go outside, somewhere where they can be quiet, alone with the " +
                        "heavens, nature and God. As long as this exists, and it certainly always will, then there will be comfort for every sorrow, " +
                        "whatever the circumstances may be. —Anne Frank",
                "In our lives, change is unavoidable, loss is unavoidable. In the adaptability and ease with which we experience change, lies our " +
                        "happiness and freedom. —Buddha",
                "Live with intention. Walk to the edge. Listen hard. Practice wellness. Play with abandon. Laugh. Choose with no regret. Do what you " +
                        "love. Live as if this is all there is. —Mary Anne Roadacher-Hershey",
                "You never regret being kind. —Nicole Shepherd",
                "They who can give up essential liberty to obtain a little temporary safety, deserve neither liberty nor safety. —Ben Franklin",
                "Forgiveness does not change the past, but it does enlarge the future. —Paul Boese",
                "The secret of health for both mind and body is not to mourn for the past, worry about the future, or anticipate troubles, but to live " +
                        "in the present moment wisely and earnestly. —Buddha",
                "True happiness is not attained through self-gratification, but through fidelity to a worthy purpose. —Helen Keller",
                "Money is neither my god nor my devil. It is a form of energy that tends to make us more of who we already are, whether it's greedy " +
                        "or loving. —Dan Millman",
                "The need for forgiveness is an illusion. There is nothing to forgive. —Rachel England",
                "Blessed are those who can give without remembering and take without forgetting. —Bernard Meltzer",
                "Reflect upon you present blessings, of which every man has many - not on your past misfortunes, of which all men have some. —Charles Dickens",
                "Even a happy life cannot be without a measure of darkness, and the word happy would lose its meaning if it were not balanced by sadness." +
                        " It is far better to take things as they come along with patience and equanimity. —Carl Jung",
                "Much of the stress that people feel doesn't come from having too much to do. It comes from not finishing what they've started. —David Allen",
                "He who lives in harmony with himself lives in harmony with the universe. —Marcus Aurelius",
                "If you want others to be happy, practice compassion. If you want to be happy, practice compassion. —Dalai Lama",
                "All the world's a stage, and the men and women merely players. They have their exits and their entrances; and one man in his time plays" +
                        " many parts. —William Shakespeare",
                "Dream as if you'll live forever, live as if you'll die today. —James Dean",
                "Happiness is not having what you want. It is appreciating what you have. —Unknown",
                "True happiness... arises, in the first place, from the enjoyment of one's self. —Joseph Addison",
                "Happiness is where we find it, but very rarely where we seek it. —J. Petit Senn",
                "At the touch of love, everyone becomes a poet. —Plato",
                "People who do not understand you will never settle for any proof, and people who appreciate you do not need any proof. —Jane Roberts",
                "It is much easier to be critical than to be correct. —Benjamin Disraeli",
                "Love can make a summer fly, or a night seem like a lifetime. —Andrew Lloyd Webber",
                "Someone's opinion of you does not have to become your reality. —Les Brown",
                "Everything that irritates us about others can lead us to an understanding of ourselves. —Carl Jung",
                "Love is like the truth, sometimes it prevails, and sometimes it hurts. —Victor M. Garcia Jr.",
                "When you like someone, you like them in spite of their faults. When you love someone, you love them with their faults. —Elizabeth Cameron",
                "People change and forget to tell each other. —Lillian Hellman",
                "If you love somebody, let them go, for if they return, they were always yours. And if they don't, they never were —Kahlil Gibran",
                "Friendship with one's self is all important, because without it one cannot be friends with anyone else in the world. —Eleanor Roosevelt",
                "Forgiveness is the attribute of the strong. —Mahatma Gandhi",
                "A friend hears the song in my heart and sings it to me when my memory fails. —Unknown",
                "The people who matter will recognize who you are. —Alan Cohen",
                "With the gift of listening comes the gift of healing. —Catherine de Hueck",
                "Love is touching souls. —Joni Mitchell",
                "A friend is one that knows you as you are, understands where you have been, accepts what you have become, and still, " +
                        "gently allows you to grow. —William Shakespeare",
                "Criticism is something we can avoid easily —by saying nothing, doing nothing, and being nothing. —Aristotle",
                "Real love takes work. You have to be willing to make the effort. —Rabbi Weinberg",
                "The happiness of life is made up of the little charities of a kiss or smile, a kind look, a heartfelt compliment. —Samuel Taylor Coleridge",
                "What most people need to learn in life is how to love people and use things instead of using people and loving things. -Unknown",
                "The consciousness of loving and being loved brings a warmth and richness to life that nothing else can bring. —Oscar Wilde",
                "The judgement of others does not change who I am. Quite the opposite is true. It reveals who they are. —Terry McPhearson",
                "Speaking with kindness creates confidence, thinking with kindness creates profoundness, giving with kindness creates love. —Lao Tseu",
                "A friend is a person with whom I may be honest. Before him, I may think aloud. —Ralph Waldo Emerson",
                "Talk sense to a fool and he calls you foolish. —Euripedes",
                "If you tell the truth, you don't have to remember anything. —Mark Twain",
                "A friend is someone who knows the song of your soul and sings it back to you when you've forgotten the words. -Unknown",
                "The real art of conversation is not only to say the right thing at the right time, but also to leave unsaid the wrong thing at " +
                        "the tempting moment. -Unknown",
                "The only way of finding the limits of the possible is by going beyond them into the impossible. -Arthur C. Clarke",
                "Life consists not in holding good cards, but in playing those you hold well. -Josh Billings",
                "Hope is like the sun, which, as we journey toward it, casts the shadow of our burden behind us. -Samuel Smiles",
                "You cannot plough a field by turning it over in your mind. -Unknown",
                "Do not wait to strike till the iron is hot; but make it hot by striking. -William B. Sprague",
                "Fortune favors the brave. -Publius Terence",
                "Amazing how we can light tomorrow with today. -Elizabeth Barrett Browning",
                "In every difficult situation is potential value. Believe this, then begin looking for it. -Norman Vincent Peale",
                "I was always looking outside myself for strength and confidence, but it comes from within. It is there all of the time. -Anna Freud",
                "I avoid looking forward or backward, and try to keep looking upward. -Charlotte Brontë",
                "Experience is the child of thought, and thought is the child of action. -Benjamin Disraeli",
                "We are all faced with a series of great opportunities - brilliantly disguised as insoluable problems. -John Gardner",
                "People with many interests live, not only longest, but happiest. -George Matthew Allen",
                "There is no happiness except in the realization that we have accomplished something. -Henry Ford",
                "You're happiest while you're making the greatest contribution. -Robert F. Kennedy",
                "Happiness is where we find it, but rarely where we seek it. -J. Petit Senn",
                "To be happy, we must not be too concerned with others. -Albert Camus",
                "Knowledge of what is possible is the beginning of happiness. -George Santayana",
                "No man is happy who does not think himself so. -Publilius Syrus",
                "The greater part of our happiness depends on our dispositions, and not on our circumstances. -Martha Washington",
                "The sure way to miss success is to miss the opportunity. -Victor Chasles",
                "The future is an opportunity. -J. F. Ware",
                "A wise man will make more opportunities than he finds. -Francis Bacon",
                "Who seeks, and will not take, when once 'tis offered, Shall never find it more. -William Shakespeare",
                "Arrange whatever pieces come your way. -Virginia Woolf",
                "Reach high, for stars lie hidden in your soul. Dream deep, for every dream precedes the goal. -Pamela Vaull Starr",
                "No one has ever achieved anything from the smallest to the greatest unless the dream was dreamed first. -Laura Ingalls Wilder",
                "Commitment leads to action. Action brings your dream closer. -Marcia Wieder",
                "The best way to make your dreams come true is to wake up. -Paul Valery",
                "We would not have to forgive people if we didn't judge them in the first place. —Barry Neil Kaufman",
                "Make new friends, but keep the old. One is silver, the other gold. -Unknown",
                "No act of kindness, however small, is ever wasted. —Aesop",
                "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. —Maya Angelou",
                "We would not have to forgive people if we didn't judge them in the first place. —Barry Neil Kaufman",
                "The journey of a thousand miles begins with one step. -Lao Tzu",
                "Tough times never last, but tough people do. -Dr. Robert Schuller",
                "Keep your face to the sunshine and you can never see the shadow. -Helen Keller",
                "There is only one success: to be able to spend your life in your own way. -Christopher Morley",
                "The best way out is always through. -Robert Frost",
                "Make each day your masterpiece. -John Wooden",
                "Every moment is a fresh beginning. -T.S. Eliot",
                "Don’t count the days, make the days count. -Muhammad Ali",
                "The difference between ordinary and extraordinary is that little extra. -Jimmy Johnson1",
                "Even if you’re on the right track, you’ll get run over if you just sit there. -Will Rodgers",
                "When you come to a roadblock, take a detour. -Mary Kay Ash",
                "When you're celebrated as a young adult, it stunts your growth as a human being. -Ethan Hawke",
                "Every strike brings me closer to the next home run. -Babe Ruth",
                "Facts do not cease to exsist because they are ignored. -Aldous Huxley",
                "Believe you can and you’re halfway there. -Theodore Roosevelt",
                "Don’t wait. The time will never be just right. -Napoleon Hill",
                "A year from now you may wish you had started today. -Karen Lamb",
                "It is never too late to be what you might have been. -George Eliot",
                "There are no traffic jams along the extra mile. -Roger Staubach",
                "Do what you can, where you are, with what you have. -Teddy Roosevelt",
                "The road to Easy Street goes through the sewer. -John Madden",
                "If there is no struggle, there is no progress. -Frederick Douglass",
                "The more I want to get something done, the less I call it work. -Richard Bach",
                "Your imagination is your preview of life’s coming attractions. -Albert Einstein",
                "The purpose of our lives is to be happy. -Dalai Lama",
                "The dreamers are the saviors of the world. -James Allen",
                "Obsessed is just a word the lazy use to describe the dedicated. -Russel Warren",
                "There are no short cuts to any place worth going. -Beverly Sills",
                "The best way to predict the future is to invent it. -Alan Kay",
                "Champions keep playing until they get it right. -Billy Jean King",
                "Always make a total effort, even when the odds are against you. -Arnold Palmer",
                "If you have everything under control, you’re not moving fast enough. -Mario Andretti",
                "I will go anywhere as long as it is forward. -David Livingston",
                "Action is the foundational key to all success. -Pablo Picasso",
                "Just keep going. Everybody gets better if they keep at it. -Ted Williams",
                "Choosing a goal and sticking to it changes everything. -Scott Reed",
                "The creation of a thousand forests is in one acorn. -Ralph Waldo Emerson",
                "It’s not whether you get knocked down, it’s whether you get up. -Vince Lombardi",
                "It wasn’t raining when Noah built the ark. -Howard Ruff",
                "Never let your memories be greater than your dreams. -Doug Ivester",
                "What the mind of man can conceive and believe, it can achieve. -Napoleon Hill",
                "All our dreams can come true, if we have the courage to pursue them. -Walt Disney",
                "Challenge yourself with something you know you could never do, and what you’ll find is that you can overcome anything. -Anonymous",
                "What lies behind us and what lies before us are tiny matters compared to what lies within us. -Henry Stanley Haskins",
                "Life is 10% what happens to you and 90% how you react to it. -Charles R. Swindoll",
                "If you cannot do great things, do small things in a great way. -Napoleon Hill",
                "You miss 100% of the shots you don’t take. -Wayne Gretzky",
                "If opportunity doesn’t knock, build a door. -Milton Berle",
                "An obstacle is often a stepping stone. -William Prescott",
                "Failure is the condiment that gives success its flavor. -Truman Capote",
                "Luck is a dividend of sweat. The more you sweat, the luckier you get. -Ray Kroc",
                "There are two primary choices in life: to accept conditions as they exist, or accept the responsibility for changing them. -Dennis Waitley",
                "Do not let what you cannot do interfere with what you can do. -John Wooden",
                "What counts is not necessarily the size of the dog in the fight–it’s the size of the fight in the dog. -Dwight D. Eisenhower",
                "Many of life’s failures are experienced by people who did not realize how close they were to success when they gave up. -Thomas Edison",
                "I haven’t failed. I’ve just found 10,000 ways that won’t work. -Thomas Edison",
                "I’ve missed more than 9,000 shots in my career. I’ve lost almost 300 games. Twenty-six times, I’ve been trusted to take the game-winning shot and missed." +
                        " I’ve failed over and over and over again in my life. And that is why I succeed. -Michael Jordan",
                "People who are crazy enough to think they can change the world, are the ones who do. -Rob Siltanen",
                "Don’t let life discourage you; everyone who got where he is had to begin where he was. -Richard L. Evans",
                "Logic will get you from A to B. Imagination will take you everywhere. -Albert Einstein",
                "Perfection is not attainable, but if we chase perfection we can catch excellence. -Vince Lombardi",
                "Winners lose much more often than losers. So if you keep losing but you’re still trying, keep it up! You’re right on track. -Matthew Keith Groves",
                "The real opportunity for success lies within the person and not in the job. -Zig Ziglar",
                "A successful man is one who can lay a firm foundation with the bricks that others throw at him. -Sidney Greenberg",
                "Pain is temporary. It may last a minute, or an hour, or a day, or a year, but eventually it will subside and something else will take its place. If I" +
                        " quit, however, it lasts forever. -Lance Armstrong",
                "Little minds are tamed and subdued by misfortune; but great minds rise above them. -Washington Irving",
                "If we treat people as they are, we make them worse. If we treat people as they ought to be, we help them become what they are capable of becoming." +
                        "-Johann Wolfgang Von Goethe",
                "In between goals is a thing called life, that has to be lived and enjoyed. -Sid Caeser",
                "If you want to test your memory, try to recall what you were worrying about one year ago today. -E. Joseph Cossman",
                "I have never in my life learned anything from any man who agreed with me. -Dudley Field Malone",
                "Whether you think you can or think you can’t, you’re right. -Henry Ford",
                "Don’t go through life, grow through life. -Eric ButterWorth",
                "If you want to make your dreams come true, the first thing you have to do is wake up. -J. M. Power",
                "A mind is like a parachute. It doesn’t work if it isn’t open. -Frank Zappa",
                "Keep away from people who try to belittle your ambitions. Small people always do that, but the really great make you feel that" +
                        " you, too, can become great. -Mark Twain",
                "The only way to have a friend is to be one. -Ralph Waldo Emerson",
                "Enjoy the little things, for one day you may look back and realize they were the big things. -Robert Brailt",
                "I don’t know the key to success, but the key to failure is trying to please everybody. -Bill Cosby",
                "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that. -Martin Luther King Jr.",
                "Holding on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one who gets burned. -Anonymous",
                "There are two ways of spreading light: to be the candle or the mirror that reflects it. -Edith Wharton",
                "The power of imagination makes us infinite. -John Muir",
                "If you do not tell the truth about yourself you cannot tell it about other people. -Virginia Woolf"
        };



        public String getQuote(String type) {
            if (type.equals("1")) {
                List<String> allList = new ArrayList<>(Arrays.asList(mQuotes));
                allList.addAll(Arrays.asList(milQuotes));
                allList.addAll(Arrays.asList(movQuotes));
                allList.addAll(Arrays.asList(pQuotes));
                allList.addAll(Arrays.asList(sQuotes));
                allList.addAll(Arrays.asList(histQuotes));
                Random random = new Random();
                int randomNumber = random.nextInt(allList.size());
                String quote = allList.get(randomNumber);
                return quote;
                }


            else if (type.equals("2")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(sQuotes.length);

                quote = sQuotes[randomNumber];
                return quote;
            }
            else if (type.equals("3")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(mQuotes.length);

                quote = mQuotes[randomNumber];
                return quote;
            }
            else if (type.equals("4")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(pQuotes.length);

                quote = pQuotes[randomNumber];
                return quote;

            }
            else if (type.equals("5")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(histQuotes.length);

                quote = histQuotes[randomNumber];
                return quote;
            }
            else if (type.equals("6")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(movQuotes.length);

                quote = movQuotes[randomNumber];
                return quote;
            }
            else if (type.equals("7")) {
                String quote;
                //Randomly select a fact
                Random randomGenerator = new Random(); //construct a new rand number generator
                int randomNumber = randomGenerator.nextInt(milQuotes.length);

                quote = milQuotes[randomNumber];
                return quote;
            }
            else {
                return "Error 404: quote not found!";
            }

            }


        }


