Vue.component("hel",{
    props:['messages'],
    template:'<div><h1 v-for="message in messages">{{ message.text }}</h1></div>'
  /*  created:function (){

    }*/
});

var elem = new Vue(
    {
        el:".login",
        template:'<hel :messages="messages" />',
        data:{
            messages: {id:"1",text:"bigtext"}
        }
    }
);
