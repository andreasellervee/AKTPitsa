grammar Pizza;

pizza
    :   pizza2
    ;
pizza2
    :   pizza1 createIn addi* addp*
    |   pizza1
    ;
pizza1
    :   createM show*? setName*?
    |   createM setName*? show*?
    ;
show
    :   showwithouti
    |   showwithi
    |   showwithoutt
    |   showwitht
    |   showm
    ;

createM
    :   'createMenu()'';'                         #Loomenuu
    ;
setName
    :   'SetMenuName(''"'Nimi'"'')'';'                #MenuuNimi
    ;
createIn
    :   'createIngredients()'';'                  #LooKoostis
    ;
addi
    :   'add new ingredient' '=' '{'Nimi',' Nimi'}'';'    #LisaKoostisListi
    ;
addp
    :   'add new pizza' '=' '{''nimi'':'Nimi',''hind'':'Arv','add (','add)*?'}'';'  #LisaPitsa
    ;
add
    :   'add'':'Nimi                             #LisaKoostis
    ;
showm
    :   'showMenu()'';'                           #NaitaMenuu
    ;
showwithouti
    :   'showWithoutIngredient(''"'Nimi'"'')'';'      #NaitaKoostiseta
    ;
showwithi
    :   'showWithIngredient(''"'Nimi'"'')'';'         #NaitaKoostisega
    ;
showwithoutt
    :   'showWithoutType(''"'Nimi'"'')'';'            #NaitaTuubita
    ;
showwitht
    :   'showWithType(''"'Nimi'"'')'';'               #NaitaTuubiga
    ;
Nimi : [a-zA-Z][a-zA-Z]*;
Arv
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;
WS : [ \t\n\r] -> skip;