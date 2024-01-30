import React from "react";
import {View, Text, SafeAreaView, StyleSheet} from "react-native";

// Componente inicial
const App = () => {
    return (
        <SafeAreaView>
            <View>
                <Text>Hola mundo</Text>
            </View>
        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
  container:{
    flex: 1,
    backgroundColor: rgba(245, 246, 250,1.0),
    alignItems: 'center',
    justifyContent: 'center',
    width: '100%',
    height: '100%',
  },
  text:{
    color: rgba(0, 0, 0,1.0),
    fontSize: 18,
    fontWeight: 'bold',
    fontFamily: 'Helvetica'
  }
})

export default App;