grammar Pizza;

pizza
    :   pizza2                          #PizzaR
    ;

pizza2
    :   createM setName? show? createIn addi+ addp* show*    #Pizza2R
    ;

show
    :   'showWithoutIngredient('Nimi');'      #NaitaKoostiseta
    |   'showWithIngredient('Nimi');'         #NaitaKoostisega
    |   'showWithoutType('Nimi');'            #NaitaTuubita
    |   'showWithType('Nimi');'               #NaitaTuubiga
    |   'showMenu();'                           #NaitaMenuu
    ;

createM
    :   'createMenu();'                         #Loomenuu
    ;
setName
    :   'setMenuName('Nimi');'                #MenuuNimi
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

Nimi : [a-zA-Z][a-zA-Z]*;
Arv
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;
WS : [ \t\n\r] -> skip;