grammar Pizza;

pizza
    :   pizza2 showm? showw?
    ;
pizza2
    :   pizza1 createIn addi* addp*
    |   pizza1 createIn addi* addp*?
    |   pizza1 createIn addi*?
    |   pizza1 createIn?
    |   pizza1
    ;
pizza1
    :   createM setName?                        
    ;

createM
    :   'createMenu();'                         #Loomenuu
    ;
setName
    :   'SetMenuName("'Nimi'");'                #MenuuNimi
    ;
createIn
    :   'createIngredients();'                  #LooKoostis
    ;
addi
    :   'add' 'new' 'incredient' '=' '{'Nimi',' Nimi'};'    #LisaKoostis
    ;
addp
    :   'add' 'new' 'pizza' '=' '{ nimi:'Nimi', hind:'Arv','add (','add)*?'};'  #LisaPitsa
    ;
add
    :   'add: 'Nimi                             #LisaKoostis
    ;
showm
    :   'showMenu();'                           #NaitaMenuu
    ;
showw
    :   'showWith("'Nimi'");'                   #NaitaKoostis
    ;
Nimi : [a-zA-Z][a-zA-Z]*;
Arv
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;
WS : [ \t\n\r] -> skip;