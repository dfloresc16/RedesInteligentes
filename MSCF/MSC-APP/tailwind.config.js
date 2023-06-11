/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    extend: {
      colors:{
        'mybg' : '#252525',
        'primary' : '#204B57'
      }
    },
  },
  plugins: [],
}
