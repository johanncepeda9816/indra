import React, { useState } from "react";

export default function Template() {
    const [currentcolor, setCurrentColor] = useState("black");

    const handleClick = (newColor) => {
        setCurrentColor(newColor);
    }

    return (
        <div style={{
            margin: 0,
            padding: 0
        }}>
            <h1
                style={{
                    textAlign: "center",
                    color: currentcolor
                }}
            >
                Prueba Básica React
            </h1>
            <div style={{
                display:"flex",
                justifyContent:"center",
                alignItems:"center",
            }}>
                <button
                    style={{
                        backgroundColor: "blue",
                        width: "20%",
                        margin: 10,
                        padding: 20,
                        alignSelf:"center"
                    }}
                    onClick={() => handleClick("blue")}
                />
                <button
                    style={{
                        backgroundColor: "red",
                        width: "20%",
                        margin: 10,
                        padding: 20,
                        alignSelf:"center"
                    }}
                    onClick={() => handleClick("red")}
                />
            </div>
        </div>
    )

}