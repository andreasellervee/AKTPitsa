grammar Pizza;

pizza
    :   pizza2                          #PizzaR
    ;
pizza2
    :   createM setName? show? createIn addi+ addp* show*?    #Pizza2R
    ;

show
    :   showwithouti
    |   showwithi
    |   showwithoutt
    |   showwitht
    |   showm
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
    :   'add new ingredient' '=' '{'Nimi',' Nimi'}' ';'    #LisaKoostisListi
    ;
addp
    :   'add new pizza' '=' '{' 'nimi' ':'Nimi',' 'hind:'Arv','add (','add)*?'}' ';'  #LisaPitsa
    ;
add
    :   'add' ':'Nimi                             #LisaKoostis
    ;
showm
    :   'showMenu();'                           #NaitaMenuu
    ;
showwithouti
    :   'showWithoutIngredient("'Nimi'");'      #NaitaKoostiseta
    ;
showwithi
    :   'showWithIngredient("'Nimi'");'         #NaitaKoostisega
    ;
showwithoutt
    :   'showWithoutType("'Nimi'");'            #NaitaTuubita
    ;
showwitht
    :   'showWithType("'Nimi'");'               #NaitaTuubiga
    ;
Nimi : [a-zA-Z][a-zA-Z]*;
Arv
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;
WS : [ \t\n\r] -> skip;